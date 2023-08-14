package Part_III.Exercises;

public class TraditionalSwitchChallenge {
    public static void main(String[] args) {

        System.out.println(natoWord('B'));

    }

    public static String natoWord(char letter) {
        switch (letter) {
            case 'A':
                return "Able";
            case 'B':
                return "Baker";
            case 'C':
                return "Charlie";
            case 'D':
                return "Dog";
            case 'E':
                return "Easy";
            default:
                return "Not on the list";
        }
    }
}
