package Part_III.Exercises;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10; // 2

        while (number > 9) {
            number = number / 10;
        }

        return lastDigit + number;
    }
}
