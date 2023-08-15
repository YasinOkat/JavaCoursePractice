package Part_III.Exercises;

public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 13));

    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99))) {
            return false;
        }

        int originalNum2 = num2;

        while (num1 > 0) {
            int digitOfNum1 = num1 % 10;

            while (originalNum2 > 0) {
                int digitOfNum2 = originalNum2 % 10;

                if (digitOfNum1 == digitOfNum2){
                    return true;
                }

                originalNum2 = originalNum2 / 10;
            }

            originalNum2 = num2;
            num1 = num1 / 10;
        }

        return false;
    }
}
