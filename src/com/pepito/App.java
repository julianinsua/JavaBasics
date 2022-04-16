package com.pepito;

public class App {
  public static void main ( String[] args ) {
    System.out.println("EVEN TEST");
    for (int i = 1; i < 25; i++)
      System.out.println("is " + i + " even? " + (isEven(i) ? "yes" : "no"));

    System.out.println("PRIME TEST");
    for (int i = 1; i < 100; i++) {
      if (isPrime(i)) System.out.println("Prime number: " + i);
    }
  }

  public static boolean isEven ( int number ) {
    return number % 2 == 0;
  }

  public static boolean isPrime ( int number ) {
    if (number == 1) return true;
    for (int i = 2; i <= ( int ) Math.sqrt(number); i++) {
      if (number % i == 0) return false;
    }
    return true;
  }
}
