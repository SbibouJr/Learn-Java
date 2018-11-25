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

    Capital yourTown = new Capital("Marseille", personList.length, 10);
    Town townList[] = {
        new Town(),
        new Town()
    };

    boolean male = true;
    int age = 28;
    String name = "Ros Billy";
    Scanner sc = new Scanner(System.in);

    Console.log("\n*** Your town ***");
    yourTown.logInfo();

    Console.log("\nThese are your people:" + "\n");
    for(Person perso : personList) {
      perso.logInfo();
    }

    Console.log("\n*** Else town ***");
    for(Town town : townList) {
      town.logInfo();
    }

    Console.log("\n" + "************************************************************************");

    Console.log("\n" + "  Hello world, i'm " + name + " and i have " + age + " years");
    Console.log((male) ? "  I'm a boy" : "  I'm a girl");


    Console.log("\n" + "Is this information accurate ? [Y/n]");

    String response = sc.nextLine();
    if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
      Console.log("Good");
    } else {
      Console.log("Not good");
    }
  }
}
