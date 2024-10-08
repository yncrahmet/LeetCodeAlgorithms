import java.util.Scanner;

public class Polindrom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int x = sc.nextInt();

        if (!isPalindrome(x)) {
            System.out.println("Not a palindrome.");
        } else {
            System.out.println("Palindrome.");
        }

    }

    // Difficulty : Easy
    public static boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int firstXNumber = x; // I store the value x.
        int reverseNumber = 0;

        while (x > 0) {

            int lastDigit = x % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            x = x / 10;

        }

        return firstXNumber == reverseNumber;

    }

}
