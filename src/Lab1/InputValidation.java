import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isValid;
        do {
            isValid = false;
            System.out.print("Enter a number between 0-1= or 90-100 ");
            int numberIn = sc.nextInt();

            if (numberIn >= 0 && numberIn <=10 || numberIn >= 90 && numberIn <= 100){
                isValid = true;
            }
            else {
                System.out.println("Invalid input, try again");
            }
        }
        while (!isValid);
    }
}
