package Part_III.Exercises;

public class NumberToWords {
    public static void main(String[] args) {

        System.out.println(reverse(-123));
        System.out.println(getDigitCount(12205));
        numberToWords(777);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reversedNumber = reverse(number);

        for (int i = 1; i <= getDigitCount(number); i++) {
            int lastDigit = reversedNumber % 10;

            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }

            reversedNumber = reversedNumber / 10;
        }
    }

    public static int reverse(int number) {
        int reverse = 0;

        int firstNumber = number;

        if (number < 0) {
            number = number * -1;
        }

        int originalNumber = number;

        for (int i = 1; i <= getDigitCount(originalNumber); i++) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        if (firstNumber < 0){
            return reverse * -1;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 0;

        if (number == 0){
            return 1;
        }

        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }
}
