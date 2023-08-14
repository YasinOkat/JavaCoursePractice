package Part_I;

public class OperatorChallenge {

    public static void main(String[] args) {

        double num = 20.00d;
        double num2 = 80.00d;

        double num3 = (num + num2) * 100d;

        double remainder = num3 % 40.00d;

        System.out.println(remainder);

        boolean isRemainderZero = remainder == 0 ? true : false;

        System.out.println(isRemainderZero);

        if (isRemainderZero == false) {
            System.out.println("Got some remainder");
        }

    }
}
