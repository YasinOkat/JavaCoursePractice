package Part_III.Exercises;

public class LargestPrime {
    public static void main(String[] args) {

        System.out.println(getLargestPrime(45));
    }


    public static int getLargestPrime(int number) {

        int largestPrime = 0;
        boolean isPrime = true;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0){
                        isPrime = false;
                    }
                }
                if (isPrime){
                    largestPrime = i;
                }
            }
        }

        if (largestPrime == 0) {
            return -1;
        }

        return largestPrime;
    }
}
