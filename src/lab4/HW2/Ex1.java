package lab4.HW2;

import java.util.Scanner;

public class Ex1 {
    // Method to generate a random number and start the game
    public static void guessNumber(Scanner sc) {
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        guessNumber(SECRET_NUMBER, sc);
    }

    public static void guessNumber(int number, Scanner sc) {
        int trials = 0;
        int guess = -1;

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            trials++;

            if (guess < number) {
                System.out.println("Try higher");
            } else if (guess > number) {
                System.out.println("Try lower");
            }
        }

        System.out.println("You got it in " + trials + " trials!");
    }

    public static void guessWord(Scanner sc) {
        final String SECRET_WORD = "secret";
        guessWord(SECRET_WORD, sc);
    }

    public static void guessWord(String guessedString, Scanner sc) {
        StringBuilder tempString = new StringBuilder("_".repeat(guessedString.length()));
        int trials = 0;
        int correctChar = 0;

        while (correctChar != guessedString.length()) {
            System.out.print("Enter one character or your guess word: ");
            String guess = sc.nextLine().toLowerCase();

            if (guess.length() == 1) {
                char guessedChar = guess.charAt(0);
                boolean correctGuess = false;

                for (int i = 0; i < guessedString.length(); i++) {
                    if (guessedString.charAt(i) == guessedChar && tempString.charAt(i) == '_') {
                        tempString.setCharAt(i, guessedChar);
                        correctChar++;
                        correctGuess = true;
                    }
                }

                if (correctGuess) {
                    System.out.println("Trial " + (trials + 1) + ": " + tempString.toString());
                } else {
                    System.out.println("Wrong guess. Trial " + (trials + 1) + ": " + tempString.toString());
                }
            } else {
                if (guessedString.equals(guess)) {
                    tempString = new StringBuilder(guessedString); // Correct guess, update to full word
                    correctChar = guessedString.length();
                } else {
                    System.out.println("Wrong guess. Try again.");
                }
            }
            trials++;
        }
        System.out.println("Congratulation !\nYou got it in " + trials + " trials.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----Menu------");
            System.out.println("1. Guess Number");
            System.out.println("2. Guess Word");
            System.out.println("3. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    guessNumber(sc);
                    break;
                case 2:
                    guessWord(sc);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid number");
            }
        }
        while (choice != 3);
    }
}
