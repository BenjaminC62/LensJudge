package lensjudge.testverification;

import lensjudge.verification.StrictVerification;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStrictVerification {

    @Test
    @DisplayName("Test isNotEmpty")
    public void testIsNotEmpty() {
        StrictVerification strictVerification = new StrictVerification();
        assertFalse(strictVerification.isNotEmpty("/export/etu/matheo.dalmasso/Documents/BUT2/SAE/SAE3.01/groupe-b2-s3.a.01/app/src/test/resources/empty.txt"));
        assertTrue(strictVerification.isNotEmpty("/export/etu/matheo.dalmasso/Documents/BUT2/SAE/SAE3.01/groupe-b2-s3.a.01/app/src/test/resources/notEmpty.txt"));
    }

    @Test
    @DisplayName("Test isFileExists")
    public void testIsFileExists() {
        StrictVerification strictVerification = new StrictVerification();
        assertTrue(strictVerification.isFileExists("/export/etu/matheo.dalmasso/Documents/BUT2/SAE/SAE3.01/groupe-b2-s3.a.01/app/src/test/resources/empty.txt"));
        assertTrue(strictVerification.isFileExists("/export/etu/matheo.dalmasso/Documents/BUT2/SAE/SAE3.01/groupe-b2-s3.a.01/app/src/test/resources/notEmpty.txt"));
        assertFalse(strictVerification.isFileExists("../resources/notexist.txt"));
    }

    @Test
    @DisplayName("Test verify")
    public void testVerify() {
        StrictVerification strictVerification = new StrictVerification();
        assertTrue(strictVerification.verify("/export/etu/matheo.dalmasso/Documents/BUT2/SAE/SAE3.01/groupe-b2-s3.a.01/app/src/test/resources/notEmpty.txt", "/export/etu/matheo.dalmasso/Documents/BUT2/SAE/SAE3.01/groupe-b2-s3.a.01/app/src/test/resources/notEmpty2.txt"));
        assertFalse(strictVerification.verify("/export/etu/matheo.dalmasso/Documents/BUT2/SAE/SAE3.01/groupe-b2-s3.a.01/app/src/test/resources/empty.txt", "/export/etu/matheo.dalmasso/Documents/BUT2/SAE/SAE3.01/groupe-b2-s3.a.01/app/src/test/resources/notEmpty.txt"));
    }
}
