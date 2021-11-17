package ComputeVAT;

public class Controller {

    private static final String MSG = "moms";

    public static void runController() {
        Dialog dialog = new Dialog();
        CalculateVat CVAT = new CalculateVat();
        View view = new View();
        double userIn = Dialog.doDiag();
        double moms = CalculateVat.doVAT(userIn);
        View.doView(moms,MSG);
    }

    private static double doDiag() {
        return 0;
    }
}
