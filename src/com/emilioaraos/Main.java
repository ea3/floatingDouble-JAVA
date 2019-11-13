package com.emilioaraos;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value"+ myMinFloatValue);
        System.out.println("Float Minimum Value"+ myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double Minimum Value"+ myMinDoubleValue);
        System.out.println("double Minimum Value"+ myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue= 5f / 3f;  //you can put an f at the end instead of the casting.
        double myDoubleValue= 5d/ 3d;
        System.out.println("My int value is " + myIntValue);
        System.out.println("My float value is " + myFloatValue);
        System.out.println("My double value is " + myDoubleValue);

        double poundsToBeCalculated= 10d;
        double poundsToKilograms = poundsToBeCalculated * 0.45359237;
        System.out.println("Kilograms = "+ poundsToKilograms);



    }
}
