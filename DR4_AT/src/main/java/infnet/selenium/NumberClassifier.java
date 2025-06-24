package infnet.selenium;

public class NumberClassifier {
    private static final int RARE_CASE_VALUE = -9999;
    private static final int HIGH_THRESHOLD = 10;
    private static final int MEDIUM_VALUE = 10;

    public void classifyAndPrint(int number) {
        printClassification(number);
        printDebugInfo(number);
    }

    private void printClassification(int number) {
        System.out.println(determineClassification(number));
    }

    private String determineClassification(int number) {
        if (number == RARE_CASE_VALUE) {
            return "CASO RARO";
        } else if (number > HIGH_THRESHOLD) {
            return "ALTO";
        } else if (number == MEDIUM_VALUE) {
            return "MÉDIO";
        } else {
            return "BAIXO";
        }
    }

    private void printDebugInfo(int number) {
        System.out.println("DEBUG: number = " + number);
    }
}
