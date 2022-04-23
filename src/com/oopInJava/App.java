package com.oopInJava;

import java.util.Scanner;

public class App {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main ( String[] args ) {
    boolean keepCalculating = true;
    while (keepCalculating) {
      double calculation = getNewAverage();
      System.out.println("Your average is: " + calculation);
      System.out.println("Calculate an other one? (Yes/ No)");
      keepCalculating = scanner.nextLine().equals("Yes");
    }
    scanner.close();
  }

  public static double getNewAverage () {
    System.out.println("How many numbers do you want to average? /r");
    int howMany = scanner.nextInt();
    scanner.nextLine();
    int[] values = getIntegers(howMany);
    return average(values);
  }

  public static int[] getIntegers ( int number ) {
    System.out.println("Enter " + number + " of integers:");
    int[] values = new int[number];
    for (int i = 0; i < values.length; i++) {
      values[i] = scanner.nextInt();
      scanner.nextLine();
    }

    return values;
  }

  public static double average ( int[] numbers ) {
    double sum = 0D;
    for (int number : numbers) {
      sum += number;
    }
    return sum / numbers.length;
  }
}