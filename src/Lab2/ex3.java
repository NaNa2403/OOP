package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class ex3 {
    public static int exponent(int base, int exp){
        int result = 1;
        for (int i = 0; i<exp ; i++){
            result *= base;
        }
        return result;
    }

    public static void testExponent(Scanner scanner){
        System.out.print("Enter the base ");
        int base = Integer.parseInt(scanner.next());
        System.out.print("Enter the power ");
        int power = Integer.parseInt(scanner.next());
        System.out.printf("%d raises to the power of %d is : %d%n",base,power,exponent(base,power));

    }

    public static boolean hasEight(int number){
        while (number >0){
            if (number %10 == 8){
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static void testHasEight(Scanner sc){
        final int SENTINEL = -1;
        int sum = 0;
        System.out.print("Enter a positive integer (or -1 to end) ");
        int number = sc.nextInt();

        while(number != SENTINEL){
            if(hasEight(number)) sum += number;
            System.out.print("Enter a positive integer (or -1 to end ");
            number = sc.nextInt();
        }
        System.out.printf("The magic sum is %d%n", sum);
    }

    static void print(int[] array){
        System.out.print("The values are [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i < array.length -1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }



    static void testPrint(Scanner sc){
        System.out.print("Enter the size of the int array: ");
        int intSize = sc.nextInt();
        int[] intArray = new int[intSize];

        System.out.print("Enter the elements of the int array:");
        for (int i = 0; i < intSize; i++) {
            intArray[i] = sc.nextInt();
        }
        print(intArray);

    }

    public static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

    static void testArrayToString(Scanner sc){
        System.out.print("Enter the size of the int array: ");
        int intSize = sc.nextInt();
        int[] intArray = new int[intSize];

        System.out.print("Enter the elements of the int array:");
        for (int i = 0; i < intSize; i++) {
            intArray[i] = sc.nextInt();
        }
        System.out.printf("Using array to String %s%n ",arrayToString(intArray));
        System.out.printf("Using Array.toString %s%n ", Arrays.toString(intArray));
    }

    public static boolean contains(int[] array, int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    static void testContains(Scanner sc){
        System.out.print("Enter the size of the array: ");
        int intSize = sc.nextInt();
        int[] intArray = new int[intSize];

        System.out.print("Enter the elements of the int array:");
        for (int i = 0; i < intSize; i++) {
            intArray[i] = sc.nextInt();
        }
        System.out.print("Enter the key to find ");
        int key = sc.nextInt();
        if(contains(intArray,key)){
            System.out.printf("Array contain %d%n" , key);
        }
        else{
            System.out.printf("Array don't contain %d%n" , key);
        }
    }

    public static int search(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    static void testSearch(Scanner sc){
        System.out.print("Enter the size of the array: ");
        int intSize = sc.nextInt();
        int[] intArray = new int[intSize];

        System.out.print("Enter the elements of the int array:");
        for (int i = 0; i < intSize; i++) {
            intArray[i] = sc.nextInt();
        }
        System.out.print("Enter the key to find ");
        int key = sc.nextInt();
        if(search(intArray, key) != -1){
            System.out.printf("Key at position %d%n" , search(intArray, key));
        }
        else{
            System.out.printf("Array don't contain %d%n", key);
        }
    }

    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    static void testEqual(Scanner sc) {
        System.out.print("Enter the size of the first array: ");
        int firstArraySize = sc.nextInt();
        int[] firstArray = new int[firstArraySize];

        System.out.print("Enter the elements of the int array: ");
        for (int i = 0; i < firstArraySize; i++) {
            firstArray[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the second array: ");
        int secondArraySize = sc.nextInt();
        int[] secondArray = new int[secondArraySize];

        System.out.print("Enter the elements of the int array: ");
        for (int i = 0; i < secondArraySize; i++) {
            secondArray[i] = sc.nextInt();
        }
        System.out.println((equals(firstArray, secondArray) ? "Two array are equal" : "Two array are not equal"));
    }

        public static int[] copyOf(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    static void testCopyOf(Scanner sc){
        System.out.print("Enter the size of the first array: ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];

        System.out.print("Enter the elements of the int array:");
        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }
        System.out.printf("Copy of array %s is %s ", Arrays.toString(array), Arrays.toString(copyOf(array)));
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return true;
    }

    static void testSwap(Scanner sc){
        System.out.print("Enter the size of the first array: ");
        int firstArraySize = sc.nextInt();
        int[] firstArray = new int[firstArraySize];

        System.out.print("Enter the elements of the int array:");
        for (int i = 0; i < firstArraySize; i++) {
            firstArray[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the second array: ");
        int secondArraySize = sc.nextInt();
        int[] secondArray = new int[secondArraySize];

        System.out.print("Enter the elements of the int array:");
        for (int i = 0; i < secondArraySize; i++) {
            secondArray[i] = sc.nextInt();
        }
        System.out.println(swap(firstArray,secondArray)? "Success": "Not equal size");
    }

    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    static void testReverse(Scanner sc){
        System.out.print("Enter the size of the array: ");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];

        System.out.print("Enter the elements of the int array:");
        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }
        System.out.printf("Array before reversal: %s%n", Arrays.toString(array));

        reverse(array);

        System.out.printf("Array after reversal: %s%n", Arrays.toString(array));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n------------------Menu:-------------------------");
            System.out.println("1. Exponent");
            System.out.println("2. Has Eight");
            System.out.println("3. Print Array");
            System.out.println("4. Array to String");
            System.out.println("5. Contains key in array");
            System.out.println("6. Search key in array");
            System.out.println("7. Two array equals");
            System.out.println("8. Copy of array");
            System.out.println("9. Swap two arrays");
            System.out.println("10. Reveser array");
            System.out.println("11. Exit");
            System.out.print("Choose an option (1-11): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    testExponent(sc);
                    break;
                case 2:
                    testHasEight(sc);
                    break;
                case 3:
                    testPrint(sc);
                    break;
                case 4:
                    testArrayToString(sc);
                    break;
                case 5:
                    testContains(sc);
                    break;
                case 6:
                    testSearch(sc);
                    break;
                case 7:
                    testEqual(sc);
                    break;
                case 8 :
                    testCopyOf(sc);
                    break;
                case 9:
                    testSwap(sc);
                    break;
                case 10 :
                    testReverse(sc);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
            System.out.println("-------------------------------");
        } while (choice != 11);
    }
}
