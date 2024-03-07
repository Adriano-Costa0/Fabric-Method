package classes;

import interfaces.Camisa;

public class CamisaUmbroFluminense implements Camisa {

  @Override
  public void showTeamInfo() {
    System.out.println("\n------- FLUMINENSE -------");
    System.out.println("Arena/Estádio: Estádio Manoel Schwartz (Laranjeiras)");
    System.out.println("Fundação: 21 de julho de 1902");
    System.out.println("------------------------\n");
  }

  @Override
  public void showFabricInfo() {
    System.out.println("\n------- UMBRO -------");
    System.out.println("Empresa: Umbro");
    System.out.println("Fundação: 1924, Wilmslow, Reino Unido");
    System.out.println("------------------------\n");
  }

}
