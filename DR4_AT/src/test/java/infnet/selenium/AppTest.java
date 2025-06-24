package infnet.selenium;

import org.junit.jupiter.api.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AppTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private NumberClassifier classifier;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
        classifier = new NumberClassifier();
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void testRareCase() {
        classifier.classifyAndPrint(-9999);
        String output = outContent.toString();
        assertTrue(output.contains("CASO RARO"));
        assertTrue(output.contains("DEBUG: number = -9999"));
    }

    @Test
    void testHighValue() {
        classifier.classifyAndPrint(15);
        String output = outContent.toString();
        assertTrue(output.contains("ALTO"));
        assertTrue(output.contains("DEBUG: number = 15"));
    }

    @Test
    void testMediumValue() {
        classifier.classifyAndPrint(10);
        String output = outContent.toString();
        assertTrue(output.contains("MÉDIO"));
        assertTrue(output.contains("DEBUG: number = 10"));
    }

    @Test
    void testLowValue() {
        classifier.classifyAndPrint(5);
        String output = outContent.toString();
        assertTrue(output.contains("BAIXO"));
        assertTrue(output.contains("DEBUG: number = 5"));
    }
}
