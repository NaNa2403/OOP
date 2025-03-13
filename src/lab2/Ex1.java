package lab2;

import java.util.Scanner;

public class Ex1 {

    static String reverseString(String inStr) {
        StringBuilder sb = new StringBuilder();
        int inStrLen = inStr.length();

        for (int i = inStrLen - 1; i >= 0; i--) {
            sb.append(inStr.charAt(i));
        }

        return sb.toString();
    }

    static void testReverseString(String inStr) {
        System.out.printf("The reverse of the string %s is %s%n", inStr, reverseString(inStr));
    }

    static int countVowels(String inStr) {
        int count = 0;
        for (int i = 0; i < inStr.length(); i++) {
            if (inStr.charAt(i) == 'a' || inStr.charAt(i) == 'e' || inStr.charAt(i) == 'i' || inStr.charAt(i) == 'o' || inStr.charAt(i) == 'u')
                count++;
        }
        return count;
    }

    static int countDigits(String inStr) {
        int count = 0;
        for (int i = 0; i < inStr.length(); i++) {
            if (Character.isDigit(inStr.charAt(i))) count++;
        }
        return count;
    }

    static void testCountVowelsDigits(String inStr) {
        System.out.printf("Number of vowels: %d (%f%%)%n", countVowels(inStr.toLowerCase()), (double) countVowels(inStr.toLowerCase()) / inStr.length());
        System.out.printf("Number of digits: %d (%f%%)%n", countDigits(inStr.toLowerCase()), (double) countDigits(inStr.toLowerCase()) / inStr.length());

    }

    static String phoneKeyPad(String inStr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++) {
            switch (inStr.charAt(i)) {
                case 'a':
                case 'b':
                case 'c':
                    sb.append(2);
                    break;
                case 'd':
                case 'e':
                case 'f':
                    sb.append(3);
                    break;
                case 'g':
                case 'h':
                case 'i':
                    sb.append(4);
                    break;
                case 'j':
                case 'k':
                case 'l':
                    sb.append(5);
                    break;
                case 'm':
                case 'n':
                case 'o':
                    sb.append(6);
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    sb.append(7);
                    break;
                case 't':
                case 'u':
                case 'v':
                    sb.append(8);
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    sb.append(9);
                    break;
                default:
                    break;
            }
        }
        return sb.toString();
    }

    static void testPhoneKeyPad(String inStr) {
        System.out.printf("Phone key pad %s%n", phoneKeyPad(inStr.toLowerCase()));
    }

    static String cipherCaesarCode(String inStr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++) {
            if (inStr.charAt(i) >= 'A' && inStr.charAt(i) <= 'W') {
                sb.append((char) (inStr.charAt(i) + 3));
            } else {
                sb.append((char) (inStr.charAt(i) - 23));
            }
        }
        return sb.toString();
    }

    static void testCipherCaesarCode(String inStr) {
        System.out.printf("The cipher string is %s%n", cipherCaesarCode(inStr.toUpperCase()));
    }

    static String decipherCaesarCode(String inStr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++) {
            if (inStr.charAt(i) >= 'D' && inStr.charAt(i) <= 'Z') {
                sb.append((char) (inStr.charAt(i) - 3));
            } else {
                sb.append((char) (inStr.charAt(i) + 23));
            }
        }
        return sb.toString();
    }

    static void testDecipherCaesarCode(String inStr) {
        System.out.printf("The decipher string is %s%n", decipherCaesarCode(inStr.toUpperCase()));
    }

    static boolean isHexString(String inStr) {
        for (int i = 0; i < inStr.length(); i++) {
            if (!(inStr.charAt(i) >= '0' && inStr.charAt(i) <= '9' || inStr.charAt(i) >= 'a' && inStr.charAt(i) >= 'A' && inStr.charAt(i) <= 'F' || inStr.charAt(i) >= 'a' && inStr.charAt(i) <= 'f')) {
                return false;
            }
        }
        return true;
    }

    static void testHexString(String inStr) {
        if (isHexString(inStr)) {
            System.out.printf("%s is a hex string %n", inStr);
        } else {
            System.out.printf("%s is not a hex string %n", inStr);
        }
    }

    static int binaryToDecimal(String inStr) {
        int decimal = 0;
        int strLen = inStr.length();
        for (int i = 0; i < strLen; i++) {
            if (inStr.charAt(i) == '1') {
                decimal += (Math.pow(2, strLen - 1 - i));
            } else if (inStr.charAt(i) != '0') {
                return -1;
            }
        }
        return decimal;
    }

    static void testBinaryToDecimal(String inStr) {
        if (binaryToDecimal(inStr) != -1) {
            System.out.printf("Decimal number for binary %s is %d%n", inStr, binaryToDecimal(inStr));
        } else {
            System.out.printf("Invalid binary string %s%n", inStr);
        }
    }

    static int hexadecimalToDecimal(String inStr) {
        int decimal = 0;

        for (int i = 0; i < inStr.length(); i++) {
            if (inStr.charAt(i) >= '0' && inStr.charAt(i) <= '9') {
                decimal += (inStr.charAt(i) - '0') * Math.pow(16, inStr.length() - 1 - i);
            } else if (inStr.charAt(i) >= 'a' && inStr.charAt(i) <= 'f') {
                decimal += (inStr.charAt(i) - 'a' + 10) * Math.pow(16, inStr.length() - 1 - i);
            } else {
                return -1;
            }
        }
        return decimal;
    }

    static void testHexadecimalToDecimal(String inStr) {
        if (hexadecimalToDecimal(inStr) != -1) {
            System.out.printf("Decimal number for hexadecimal %s is %d%n", inStr, hexadecimalToDecimal(inStr.toLowerCase()));
        } else {
            System.out.printf("Invalid hexadecimal string %s%n", inStr);
        }
    }

    static int octalToDecimal(String inStr) {
        int decimal = 0;

        for (int i = 0; i < inStr.length(); i++) {
            if (inStr.charAt(i) >= '0' && inStr.charAt(i) <= '8') {
                decimal += (inStr.charAt(i) - '0') * Math.pow(8, inStr.length() - 1 - i);
            } else {
                return -1;
            }
        }
        return decimal;
    }


    static void testOctalToDecimal(String inStr) {
        if (octalToDecimal(inStr) != -1) {
            System.out.printf("Decimal number for octal %s is %d%n", inStr, octalToDecimal(inStr));
        } else {
            System.out.printf("Invalid octal string %s%n", inStr);
        }
    }

    static int radixToDecimal(int radix, String inStr) {
        int decimal = 0;

        if (radix < 0 || radix > 16) {
            return -2;
        }

        for (int i = 0; i < inStr.length(); i++) {
            if (inStr.charAt(i) >= '0' && inStr.charAt(i) <= '9') {
                decimal += (inStr.charAt(i) - '0') * Math.pow(radix, inStr.length() - 1 - i);
            } else if (inStr.charAt(i) >= 'a' && inStr.charAt(i) <= 'f') {
                decimal += (inStr.charAt(i) - 'a' + 10) * Math.pow(radix, inStr.length() - 1 - i);
            } else {
                return -1;
            }
        }
        return decimal;
    }

    static void testRadixToDecimal(int radix, String inStr) {
        if (radixToDecimal(radix, inStr) == -1) {
            System.out.printf("Invalid hexadecimal string %s%n", inStr);
        } else if (radixToDecimal(radix, inStr) == -2) {
            System.out.printf("Invalid radix %d", radix);
        } else {
            System.out.printf("Decimal number for hexadecimal %s is %d%n", inStr, radixToDecimal(radix, inStr.toLowerCase()));
            System.out.printf("Invalid hexadecimal string %s%n", inStr);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n---------------Menu------------------");
            System.out.println("1. Reverse a String");
            System.out.println("2. Count Vowels and Digits in a String");
            System.out.println("3. Phone KeyPad Encoding");
            System.out.println("4. Caesar Cipher Encoding");
            System.out.println("5. Caesar Cipher Decoding");
            System.out.println("6. Test Hex String");
            System.out.println("7. Binary to Decimal Conversion");
            System.out.println("8. Hexadecimal to Decimal Conversion");
            System.out.println("9. Octal to Decimal Conversion");
            System.out.println("10. Radix to Decimal Conversion");
            System.out.println("11. Exit");
            System.out.print("Choose an option (1-11): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a String: ");
                    String inStr1 = scanner.nextLine();
                    testReverseString(inStr1);
                    break;
                case 2:
                    System.out.print("Enter a String: ");
                    String inStr2 = scanner.nextLine();
                    testCountVowelsDigits(inStr2);
                    break;
                case 3:
                    System.out.print("Enter a String: ");
                    String inStr3 = scanner.nextLine();
                    testPhoneKeyPad(inStr3);
                    break;
                case 4:
                    String ceasarCode1 = scanner.nextLine();
                    testCipherCaesarCode(ceasarCode1);
                    break;
                case 5:
                    String decipherCaesarCode = scanner.nextLine();
                    testDecipherCaesarCode(decipherCaesarCode);
                    break;
                case 6:
                    System.out.print("Enter a String: ");
                    String hexString = scanner.nextLine();
                    testHexString(hexString);
                    break;
                case 7:
                    System.out.print("Enter a Binary String: ");
                    String binaryString = scanner.nextLine();
                    testBinaryToDecimal(binaryString);
                    break;
                case 8:
                    System.out.print("Enter a Hexadecimal String: ");
                    String hexadecimalString = scanner.nextLine();
                    testHexadecimalToDecimal(hexadecimalString);
                    break;
                case 9:
                    System.out.print("Enter an Octal String: ");
                    String octalString = scanner.nextLine();
                    testOctalToDecimal(octalString);
                    break;
                case 10:
                    System.out.print("Enter Radix and Hex String: ");
                    int radix = scanner.nextInt();
                    scanner.nextLine();
                    String radixString = scanner.nextLine();
                    testRadixToDecimal(radix, radixString);
                    break;
                case 11:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");

            }
            System.out.println("----------------------------------------------------------------");
        } while (choice != 11);

    }
}
