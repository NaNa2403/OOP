package Lab4.HW2;

import java.util.Scanner;

public class Ex3 {
    public static String exchangeCipher(String inStr) {
        inStr = inStr.toUpperCase();

        StringBuilder cipherText = new StringBuilder();

        for (int i = 0; i < inStr.length(); i++) {
            char plainChar = inStr.charAt(i);
            char cipherChar = (char) ('A' + 'Z' - plainChar);
            cipherText.append(cipherChar);
        }

        return cipherText.toString();
    }

    // Method to test the exchange cipher
    public static void testExchangeCipher(Scanner sc) {
        System.out.print("Enter a plaintext string: ");
        String plainText = sc.next();

        String cipherText = exchangeCipher(plainText);

        System.out.println("The ciphertext string is: " + cipherText);
    }

    public static boolean isPalindromicWord(String inStr) {
        inStr = inStr.toLowerCase();

        int fIdx = 0;
        int bIdx = inStr.length() - 1;

        while (fIdx < bIdx) {
            if (inStr.charAt(fIdx) != inStr.charAt(bIdx)) {
                return false;
            }
            fIdx++;
            bIdx--;
        }
        return true;
    }

    // Method to test if a word is a palindrome
    public static void testPalindromicWord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        if (isPalindromicWord(word)) {
            System.out.printf("\"%s\" is a palindrome.",word);
        } else {
            System.out.printf("\"%s\" is not a palindrome.", word);
        }
    }

    public static boolean isPalindromicPhrase(String inStr) {
        // Convert the string to lowercase for case insensitivity and remove non-alphabet characters
        inStr = inStr.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int fIdx = 0;
        int bIdx = inStr.length() - 1;

        while (fIdx < bIdx) {
            // Compare characters at forward and backward indices
            if (inStr.charAt(fIdx) != inStr.charAt(bIdx)) {
                return false;
            }
            fIdx++;
            bIdx--;
        }
        return true;
    }

    // Method to test if a phrase is a palindrome
    public static void testPalindromicPhrase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = sc.nextLine();

        if (isPalindromicPhrase(phrase)) {
            System.out.printf("\"%s\" is a palindrome.", phrase);
        } else {
            System.out.printf("\"%s\" is not a palindrome.", phrase);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do{
            System.out.println("\n-------------Menu-----------");
            System.out.println("1. Exchange Cipher");
            System.out.println("2. Palindromic Word");
            System.out.println("3. Palindromic Phrase");
            System.out.println("4. Exit");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    testExchangeCipher(sc);
                    break;
                case 2:
                    testPalindromicWord();
                    break;
                case 3:
                    testPalindromicPhrase();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid number");
            }
        }while (choice != 4);
    }
}
