package Part_III.Exercises;

public class WhileLoopChallenge {
    public static void main(String[] args) {

        for (int i = 5; i <= 20; i++) {
            if (isEvenNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }
}
