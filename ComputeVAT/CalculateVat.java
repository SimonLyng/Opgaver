package ComputeVAT;

public class CalculateVat {
   static int PRCVAT = 25;

    public static double doVAT(double number){
        double VAT = number / 100 * PRCVAT;
        return VAT;
    }
}
