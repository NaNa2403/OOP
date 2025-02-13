package Lab2.Part1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String inStr;
        int inStrLen;

        StringBuilder sb = new StringBuilder();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inStr = scanner.nextLine();
        inStrLen = inStr.length();

        for (int i = inStrLen-1; i >= 0 ; i--) {
            sb.append(inStr.charAt(i));
        }

        System.out.printf("The reverse of the string %s is %s", inStr, sb.toString());
    }
}
