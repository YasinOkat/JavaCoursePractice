package Part_III.Exercises;

public class DigitSumChallenge {
    public static void main(String[] args) {

        System.out.println(sumDigits(1235));

    }

    public static int sumDigits(int number) {
        if (number < 0){
            return -1;
        }

        int sum = 0;
        int lastDigit = (number % 10);

        while (number > 9){
            number = number / 10;
            sum += number % 10;
        }
        return sum + lastDigit;
    }
}
