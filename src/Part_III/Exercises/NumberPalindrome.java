package Part_III.Exercises;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }


    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = -1 * number;
        }

        int reverse = 0;
        int originalNumber = number;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }

        return reverse == originalNumber;
    }

}
