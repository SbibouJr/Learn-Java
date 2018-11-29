package fr.sbiboujr.learnjava;

import fr.sbiboujr.utils.Console;

public class Town {
  private String name;
  private int maxPopulation;
  private int population;

  public Town() {
    this.name = "Unknown";
    this.maxPopulation = 0;
    this.population = 0;
  }

  public Town(String name, int population, int maxPopulation) {
    this.name = name;
    this.maxPopulation = maxPopulation;
    this.population = population;
  }

  public void logInfo() {
    Console.log(this.name.toUpperCase() + ": \n" + "  - Population: " + this.population + "/" + this.maxPopulation);
  }
}
