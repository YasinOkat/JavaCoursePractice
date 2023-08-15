package Part_III.Exercises;

public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sumOfEvenNums = 0;

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 == 0){
                sumOfEvenNums += digit;
            }

            number = number / 10;
        }
        return sumOfEvenNums;
    }
}
