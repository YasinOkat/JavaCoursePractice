package Part_I;

public class PrimitiveTypesChallenge {

    public static void main(String[] args) {

        byte byteNum = 14;
        short shortNum = 10;
        int intNum = 32;
        long longNum = 50000 + (10L * (byteNum + shortNum + intNum));

        System.out.println(longNum);

    }
}
