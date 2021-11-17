package ComputeVAT;

public class View {
    static String MSG = "MOMS";
     static String CURRENCY = "DKK";

    public static void doView(double result, String typeOfResult) {
        System.out.printf("Du betaler %.2f%3s i %s%n", result, CURRENCY, MSG);
    }
}
