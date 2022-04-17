package com.Karen;

import java.util.Scanner;

public class App {
  public static void main ( String[] args ) {
    Scanner scanner = new Scanner(System.in);
    boolean leave = false;
    while (!leave) {
      tellMeSomethingNice(scanner);
      guessAge(scanner);
      leave = shouldILeave(scanner);
    }
    scanner.close();
  }

  public static void tellMeSomethingNice ( Scanner scanner ) {
    System.out.println("Tell me something nice, please ");
    String insult = scanner.nextLine();

    System.out.println("How could you tel me '" + insult + "'? Why would you hurt me like that? BUAAAAA!!!!");
    System.out.println("*Exits crying...*");
    System.out.println("You monster.");
  }

  public static void guessAge ( Scanner scanner ) {
    System.out.println("*After an intensive soothing, we come back*");
    System.out.println("I'm better now, thanks... I'm still angry, I shouldn't have to tolerate this. Do you know how old I am?");
    int age = scanner.nextInt();
    scanner.nextLine();

    if (age > 65) {
      System.out.println(age + "???? How could you say " + age + ". I'm not made of iron you know.... *Sobs quietly, then yels loudly* BUAAAAAAA!!!");
      System.out.println("*Exits crying*");
      System.out.println("You monster.");
    } else if (age > 35) {
      System.out.println(age + "... You could as well tell me I'm fat, old and completely useless...BUAAAAAAA!!!!");
      System.out.println("*Exits crying*");
      System.out.println("You know, I'm starting to dislike you too");
    } else {
      System.out.println(age + ". So you think I'm some kind of easy target for your flirting. You think I'm an object you can buy with a cheesy pickup line... I hate you! BUAAAAAAA!!!!");
      System.out.println("*Exits crying*");
      System.out.println("You pig.");
    }
  }

  public static boolean shouldILeave ( Scanner scanner ) {
    System.out.println("stay or leave?");
    String decision = scanner.nextLine();

    return !decision.equalsIgnoreCase("stay");
  }
}