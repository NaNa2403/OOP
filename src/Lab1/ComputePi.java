package Lab1;

public class ComputePi {
    public static void main(String[] args) {
        int MAXTERM = 10000;
        double sum = 0.0;
        for (int i = 1; i <= MAXTERM; i++) {
            if (i % 2 == 1) {
                sum += (double) 1.0 / (i * 2 - 1);
            } else {
                sum -= (double) 1.0 / (i * 2 - 1);
            }
        }
        System.out.println("Pi is : " + 4*sum);
        System.out.println("Percent accurate " + (4*sum) / Math.PI *100 + "%");
    }
}
