package classes;

import interfaces.Camisa;

/**
 * CamisaBrasil
 */
public class CamisaNikeBrasil implements Camisa {

  @Override
  public void showTeamInfo() {
    System.out.println("\n------- BRASIL -------");
    System.out.println("Arena/Estádio: Arena Pantanal");
    System.out.println("Fundação: 1915");
    System.out.println("------------------------\n");
  }

  @Override
  public void showFabricInfo() {
    System.out.println("\n------- NIKE -------");
    System.out.println("Empresa: Nike, Inc.");
    System.out.println("Fundação: 25 de janeiro de 1964, Eugene, Oregon, EUA");
    System.out.println("------------------------\n");
  }

}