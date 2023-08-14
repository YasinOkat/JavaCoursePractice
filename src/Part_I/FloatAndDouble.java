package Part_I;

public class FloatAndDouble {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float Minimum Value: " + myMinFloatValue); // 1.4E-45
        System.out.println("Float Maximum Value: " + myMaxFloatValue); // 3.4029235E38

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double Minimum Value: " + myMinDoubleValue); // 4.9E-324
        System.out.println("Double Maximum Value: " + myMaxDoubleValue); // 1.7976931348623157E308

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("Int: " + myIntValue);
        System.out.println("Float: " + myFloatValue);
        System.out.println("Double: " + myDoubleValue);

        // Float: 32 bits
        // Double: 64 bits

        double pounds = 324;
        double kilograms = pounds * 0.45359237;

        System.out.println("The " + pounds + " converted to kilograms: " + kilograms);

    }
}
