public class Tribonancci {
    public static void main(String[] args) {
        int n = 4;
        int tn;
        int tnMinus1 = 2;
        int tnMinus2 = 1;
        int tnMinus3 = 1;
        int nMax = 20;
        int sum = tnMinus1 + tnMinus2 + tnMinus3;
        double average;

        System.out.println("The first " + nMax + " Tribonancci number are: ");
        System.out.print(tnMinus3 + " " + tnMinus2 + " " + tnMinus1 + " ");
        while (n <= nMax) {
            tn = tnMinus1 + tnMinus2 + tnMinus3;
            System.out.print(tn + " ");
            sum += tn;
            tnMinus3 = tnMinus2;
            tnMinus2 = tnMinus1;
            tnMinus1 = tn;
            ++n;
        }
        System.out.println();
        average = (double) (sum / nMax);
        System.out.println("The average is " + average);

    }
}
