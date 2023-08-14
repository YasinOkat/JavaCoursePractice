package Part_II;

public class Methods {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);
        calculateScore(true, 5000, 5, 500);
        calculateScore(false, 3000, 1, 100);
        calculateScore(true, 10000, 10, 300);

        int myScore = calculateScore(false, 4000, 3, 200);

        System.out.println("My score is: " + myScore);

        displayHighScorePosition("Yasin", calculateHighScorePosition(1500));
        displayHighScorePosition("Ahmet", calculateHighScorePosition(900));
        displayHighScorePosition("Mehmet", calculateHighScorePosition(400));
        displayHighScorePosition("Mahmut", calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            System.out.println("Game is not over yet, keep playing");
            return 0;
        }
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on a high score table");
    }

    public static int calculateHighScorePosition(int score) {
        int position;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }
}
