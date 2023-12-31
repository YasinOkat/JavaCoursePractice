package Part_III.Exercises;

public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(9, 32, 42));

    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 || num3 < 10 || num3 > 1000) {
            return false;
        }

        int lastDigitOfNum1 = num1 % 10;
        int lastDigitOfNum2 = num2 % 10;
        int lastDigitOfNum3 = num3 % 10;

        return lastDigitOfNum1 == lastDigitOfNum2 || lastDigitOfNum1 == lastDigitOfNum3 || lastDigitOfNum2 == lastDigitOfNum3;
    }

    public static boolean isValid(int num) {
        if (num >= 10 && num <= 1000){
            return true;
        }
        return false;
    }
}
