package Part_III.Exercises;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double avg = 0;
        int count = 0;

        System.out.println((int) Math.round(-7.5));

        while (true) {
            try {
                double input = Double.parseDouble(scanner.nextLine());
                sum += input;
                avg = sum / (count + 1);
                count++;
            } catch (NumberFormatException e){
                System.out.println("SUM = " + (int) Math.round(sum + 0.5) + " AVG = " + (int) Math.round(avg));
                break;
            }
        }
    }
}
