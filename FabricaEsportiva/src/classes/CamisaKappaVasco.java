package classes;

import interfaces.Camisa;

public class CamisaKappaVasco implements Camisa {

  @Override
  public void showTeamInfo() {
    
    System.out.println("\n------- VASCO -------");
    System.out.println("Arena/Estádio: -");
    System.out.println("Fundação: 21 de agosto de 1898");
    System.out.println("------------------------\n");
    
  }

  @Override
  public void showFabricInfo() {
    System.out.println("\n------- KAPPA -------");
    System.out.println("Empresa: Kappa");
    System.out.println("Fundação: 1916, Turim, Itália");
    System.out.println("------------------------\n");
  }

}
