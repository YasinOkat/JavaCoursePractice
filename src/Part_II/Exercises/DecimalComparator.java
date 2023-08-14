package Part_II.Exercises;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1756,3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int convertedNum1 = (int) (num1 * 1000);
        int convertedNum2 = (int) (num2 * 1000);
        if (convertedNum1 == convertedNum2){
            return true;
        }
        return false;
    }
}
