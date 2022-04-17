package com.pepito;

public class App {
  public static void main ( String[] args ) {
    String numberAsString = "2018.2";
    System.out.println("number as string= " + numberAsString);

    double doubleNumber = Double.parseDouble(numberAsString);
    int intNumber = ( int ) Double.parseDouble(numberAsString);

    System.out.println("number as integer= " + (intNumber + 1));
    System.out.println("number as integer= " + (doubleNumber + 1));

  }
}