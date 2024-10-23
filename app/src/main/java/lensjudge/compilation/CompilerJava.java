package lensjudge.compilation;

import java.io.File;
import java.io.IOException;

public class CompilerJava extends CompilerStrategy {

    @Override
    public boolean isCompatible(String languageSelected) {
        return languageSelected.equals("java");
    }

    @Override
    public String getBinaryFileName(String sourceFileName) {
        return sourceFileName.replace(".java", ".class");
    }

    @Override
    public void executeCompilerCommand(File sourceFile, String binaryFile) throws IOException, InterruptedException {
        ProcessBuilder processBuilder = new ProcessBuilder("javac", sourceFile.getAbsolutePath());
        processBuilder.inheritIO();
        Process process = processBuilder.start();
        process.waitFor();
    }


    protected String getLanguage() {
        return "java";
    }
}