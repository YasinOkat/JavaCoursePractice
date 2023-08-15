package Part_III.Exercises;

import java.util.Scanner;
public class MinAndMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minNum = 0;
        int maxNum = 0;
        int count = 0;

        while (true){
            System.out.println("Enter a number or any character to quit:");
            try {
                int number = Integer.parseInt(scanner.nextLine());
                if (count == 0 || number > maxNum){
                    maxNum = number;
                }
                if (count == 0 || number < minNum){
                    minNum = number;
                }
                count++;

            } catch (NumberFormatException e){
                System.out.println("Exiting the loop...");
                break;
            }
        }

        System.out.println("The max number: " + maxNum + " and the min number: " + minNum);

    }
}
