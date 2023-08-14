package Part_II.Exercises;

public class OverloadedMethod {
    public static void main(String[] args) {

        System.out.println(convertToCentimeters(5, 8));
    }

    public static double convertToCentimeters(int heightInInches) {
        return 2.54 * heightInInches;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        return  convertToCentimeters(heightInFeet * 12 + heightInInches);
    }
}
