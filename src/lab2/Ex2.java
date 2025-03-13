package lab2;

import java.util.Scanner;

public class Ex2 {
    static int[] createArray(Scanner sc){
        System.out.print("Enter the number of items :");
        int numItems = sc.nextInt();

        int[] array = new int[numItems];

        System.out.print("Enter the value of all items (separated by spaces :");
        for (int i = 0; i < numItems; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    static void printArray(int[] array){
        System.out.print("The values are [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < array.length -1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    static int[] generateStudentGrades(Scanner sc){

        System.out.print("Enter the number of students ");
        int numberStudent = sc.nextInt();

        int[] studentArray = new int[numberStudent];

        for (int i = 0; i < numberStudent; i++){
            System.out.printf("Enter the number for student %d :", i);
            studentArray[i] = sc.nextInt();

            if(studentArray[i] < 0 || studentArray[i] > 100){
                System.out.println("Invalid grades");
                i--;
            }
        }
        return studentArray;
    }

    static void simpleGradesStatics(int[] array){
        int sumGrades = array[0];
        int minGrades = array[0];
        int maxGrades = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minGrades){
                minGrades = array[i];
            }
            else if (array[i] > maxGrades) {
                maxGrades = array[i];
            }
            sumGrades += array[i];
        }

        System.out.printf("The average is %.2f%n", (double)sumGrades / array.length);
        System.out.println("The minimum is " + minGrades);
        System.out.println("The maximum is " + maxGrades);

    }

    static String hexadecimalToBinary(String hexStr){
        StringBuilder sb = new StringBuilder();
        final String[] HEX_BITS = {"0000" , "0001", "0010" , "0011" , "0100" ,
                "0101", "0110", "0111" , "1000", "1001", "1010",
                "1011", "1100", "1101", "1110", "1111"};
        for (int i = 0; i < hexStr.length(); i++){
            if(hexStr.charAt(i) >= '1' && hexStr.charAt(i) <= '9'){
                sb.append(HEX_BITS[hexStr.charAt(i) - '1']);
            }
            else if (hexStr.charAt(i) >= 'a' && hexStr.charAt(i) <= 'f') {
                sb.append(HEX_BITS[hexStr.charAt(i) - 'a' + 10]);
            }
            else { return "Invalid hexadecimal";
            }
            if (i < hexStr.length() -1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }



    static void testHexadecimalToBinary(Scanner sc){
        System.out.print("Enter a Hexadecimal string ");
        String hexStr = sc.next();

        System.out.printf("The equivalent binary for hexadecimal %s is : %s%n", hexStr, hexadecimalToBinary(hexStr.toLowerCase()));
    }

    static String decimalToHexadecimal(int positiveInteger){
        StringBuilder sb = new StringBuilder();
        final String[] hexDigits = {"0", "1", "2", "3","4","5","6","7","8",
                "9","A","B","C","D","E","F"};;
        if (positiveInteger == 0) {
            return "0";
        }

        while (positiveInteger > 0) {
            int remainder = positiveInteger % 16;
            sb.insert(0, hexDigits[remainder]);
            positiveInteger /= 16;
        }

        return sb.toString();
    }



    static void testDecimalToHexadecimal(Scanner scanner){
        System.out.print("Enter a decimal number ");
        int positiveNumber = scanner.nextInt();

        System.out.printf("The equivalent is : %s%n", decimalToHexadecimal(positiveNumber));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n------------------Menu:-------------------------");
            System.out.println("1. Create and print an array");
            System.out.println("2. Generate and print student grades statistics");
            System.out.println("3. Convert Hexadecimal to Binary");
            System.out.println("4. Convert Decimal to Hexadecimal");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    printArray(createArray(sc));
                    break;
                case 2:
                    simpleGradesStatics(generateStudentGrades(sc));
                    break;
                case 3:
                    testHexadecimalToBinary(sc);
                    break;
                case 4:
                    testDecimalToHexadecimal(sc);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
            System.out.println("-------------------------------");
        } while (choice != 5);

    }
}
