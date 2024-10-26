package lensjudge.Execution;

import lensjudge.compilation.CompilerC;
import lensjudge.process.ProcessAdapter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExecutionC {
    @Test
    @DisplayName("Test ExecutionC")
    public void testExecute() {
        ExecutionC executionC = new ExecutionC();
        String sourceFilePath = "SAEA3.01/groupe-b2-s3.a.01/app/src/test/resources/ProgTestSae/test.c";
        File sourceFile=new File(sourceFilePath);
        CompilerC compilerC=new CompilerC();
        String binaryFileName;
        binaryFileName= compilerC.getBinaryFileName(sourceFilePath);
        compilerC.executeCompilerCommand(sourceFile, binaryFileName);
        ProcessAdapter process=executionC.execute(sourceFilePath, binaryFileName);
        process.startProcess();
        assertEquals("Salut !\n", process.getStandardOutput());
    }
}
