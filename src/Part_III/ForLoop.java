package Part_III;

public class ForLoop {
    public static void main(String[] args) {

        for (double interestRate = 7.5; interestRate <= 10d; interestRate += 0.25) {
            System.out.println("100 at %" + interestRate + " interest = " + calculateInterest(100d, interestRate));
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
