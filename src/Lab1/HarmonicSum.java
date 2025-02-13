public class HarmonicSum {
    public static void main(String[] args) {
        final int MAXDENOMINATOR = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;

        for (int denominator = 1; denominator <= MAXDENOMINATOR; ++denominator){
            sumL2R += (double) 1/denominator;
        }
        System.out.println("The sum from left to right is " + sumL2R);

        for (int denominator = MAXDENOMINATOR; denominator > 0; --denominator){
            sumR2L += (double) 1/denominator;
        }
        System.out.println("The sum from left to right is " + sumR2L);

        if (sumL2R > sumR2L){
            absDiff = sumL2R - sumR2L;
        }
        else{
            absDiff = sumR2L - sumL2R;
        }
        System.out.println("The difference of the sum from left to right and the sum from right to left is " + absDiff);
    }
}
