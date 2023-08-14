package Part_II.Exercises;

public class PlayingCat {
    public static void main(String[] args) {

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (!summer) {
            return temperature <= 35 && temperature >= 25;
        } else {
            return temperature <= 45 && temperature >= 25;
        }
    }
}
