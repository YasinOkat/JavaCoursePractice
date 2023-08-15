package Part_III.Exercises;

public class Sum3And5Challenge {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for (int num = 1; num <= 1000; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                count++;
                if (count == 6) {
                    break;
                }
                System.out.println(num);
                sum += num;
            }
        }

        System.out.println("The sum is: " + sum);
    }
}
