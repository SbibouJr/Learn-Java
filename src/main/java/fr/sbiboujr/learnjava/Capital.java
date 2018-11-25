package fr.sbiboujr.learnjava;

public class Capital extends Town {
  public Capital() {
    super();
  }

  public Capital(String name, int population, int maxPopulation) {
    super(name, population, maxPopulation);
  }

  public void logInfo() {
    Console.log("I'm a Capital");
    super.logInfo();
  }
}
