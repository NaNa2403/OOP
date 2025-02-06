public class Fibonancci {
    public static void main(String[] args) {
        int n = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2;
        double average;

        System.out.println("The first " + nMax + " Fibonancci number are: ");
        System.out.print(fnMinus1 + " " + fnMinus2 + " ");

        while (n <= nMax) {
            fn = fnMinus1 + fnMinus2;
            System.out.print(fn + " ");
            sum += fn;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            ++n;
        }
        System.out.println();
        average = (double) (sum / nMax);
        System.out.println("The average is " + average);
    }
}
