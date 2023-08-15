package Part_III.Exercises;

public class ForExercise {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count + " prime numbers found");
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 1) {
            return false;
        }

        for (int i = 2; i < wholeNumber; i++) {
            if (wholeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
