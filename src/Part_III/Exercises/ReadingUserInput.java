package Part_III.Exercises;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int i = 1;
        int num = 0;

        while (i <= 5) {
            System.out.println("Enter number " + i);
            try {
                num += Integer.parseInt(scanner.nextLine());
                i++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        }

        System.out.println(num);

    }
}
