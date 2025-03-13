package lab1;

public class ExtractDigit {
    public static void main(String[] args) {
        int n = 15432;
        while (n>0){
            int digit = n%10;

            System.out.print(digit + "");

            n= n/10;
        }
    }
}
