package com.pepito;

public class Hello {
  public static void main ( String[] args ) {
    int minInt = Integer.MIN_VALUE, maxInt = Integer.MAX_VALUE;
    float minFloat = Float.MIN_VALUE, maxFloat = Float.MAX_VALUE;
    double minDouble = Double.MIN_VALUE, maxDouble = Double.MAX_VALUE;
    short minShort = Short.MIN_VALUE, maxShort = Short.MAX_VALUE;
    long minLong = Long.MIN_VALUE, maxLong = Long.MAX_VALUE;

    long number = 2_147_483_647_234L;
    float number2 = 1.456789F;

    System.out.println("Integers from " + minInt + " to " + maxInt);
    System.out.println("Floats from " + minFloat + " to " + maxFloat);
    System.out.println("Doubles from " + minDouble + " to " + maxDouble);
    System.out.println("Shorts from " + minShort + " to " + maxShort);
    System.out.println("Longs from" + minLong + " to " + maxLong);

    byte byteValue = ( byte ) (maxInt / 2);
    System.out.println("Some byte value: " + byteValue);
    String myString = "go and learn some java, you javascript monkey";
    System.out.println(myString);
  }
}
