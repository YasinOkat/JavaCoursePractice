package Part_II.Exercises;

public class SpeedConverter {
    public static void main(String[] args) {

        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour > 0) {
            return Math.round(0.621371192 * kilometersPerHour);
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour) {
        long miles = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");

        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");
        }
    }
}
