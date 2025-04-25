package lab11.strategy.ex1.strategies;

public class CreditCardValidator {
    public static boolean isValid(String number) {
        try {
            long cardNumber = Long.parseLong(number);
            return isValid(cardNumber);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isValid(long number) {
        return (getSize(number) >= 13 && getSize(number) <= 16) &&
                (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                        prefixMatched(number, 37) || prefixMatched(number, 6)) &&
                ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
    }

    private static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
        }
        return sum;
    }

    private static int getDigit(int number) {
        return number < 10 ? number : number / 10 + number % 10;
    }

    private static int sumOfOddPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(num.charAt(i) + "");
        }
        return sum;
    }

    private static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    private static int getSize(long d) {
        return String.valueOf(d).length();
    }

    private static long getPrefix(long number, int k) {
        String num = number + "";
        return num.length() < k ? number : Long.parseLong(num.substring(0, k));
    }
}
