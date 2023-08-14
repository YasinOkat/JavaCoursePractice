package Part_II.Exercises;

public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(125));
    }

    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return (hours + "h " + remainingMinutes + "m " + remainingSeconds + "s");
    }
}
