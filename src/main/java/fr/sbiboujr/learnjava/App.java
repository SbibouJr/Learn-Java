package fr.sbiboujr.learnjava;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
  public static void main(String args[]) {

    Console.log("\n" + "************************************************************************");
    Console.log("************************ Learn Java ************************************");
    Console.log("************************************************************************" + "\n");

    Person personList[] = {
      new Person("Ma Rie", 33, false),
      new Person(),
      new Person("Astrid delajungle", 24, false)
    };

    boolean male = true;
    int age = 28;
    String name = "Ros Billy";
    Scanner sc = new Scanner(System.in);

    Console.log("These are your people:" + "\n");
    for(Person perso : personList) {
      perso.logInfo();
    }

    Console.log("\n" + "************************************************************************");

    Console.log("\n" + "  Hello world, i'm " + name + " and i have " + age + " years");

    if (male) {
      Console.log("  I'm a boy");
    } else {
      Console.log("  I'm a girl");
    }

    Console.log("\n" + "Is this information accurate ? [Y/n]");
    String response = sc.nextLine();
    if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
      Console.log("Good");
    } else {
      Console.log("Not good");
    }

  }
}
