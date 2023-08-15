package Part_III.Exercises;

public class FlourPackProblem {
    public static void main(String[] args) {

        System.out.println(canPack(2, 2, 11));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if ((bigCount * 5) + (smallCount) >= goal) {
            if ((bigCount * 5) >= goal) {
                return (goal % 5) <= smallCount;
            } else{
                return (goal - (bigCount * 5)) <= smallCount;
            }
        }
        return false;
    }
}
