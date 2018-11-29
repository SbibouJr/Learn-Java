package fr.sbiboujr.learnjava;

import fr.sbiboujr.utils.Console;

public class Person {
  private String name;
  private int age;
  private boolean male;

  public Person() {
    this.male = true;
    this.name = "Jean Eude";
    this.age = 30;
  }

  public Person(String name, int age, boolean male) {
    this.male = male;
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public boolean isMale() {
    return this.male;
  }

  public void logInfo() {
    Console.log(" - " + this.getName() + ", is a " + ((this.isMale()) ? "boy and he have " : "girl and she have ") + this.getAge() + " years.");
  }
}
