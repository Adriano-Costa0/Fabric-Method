package classes;

import interfaces.Camisa;

public class CamisaPumaBotafogo implements Camisa{

  @Override
  public void showTeamInfo() {
    System.out.println("\n------- BOTAFOGO -------");
    System.out.println("Arena/Estádio: Estádio Olímpico Nilton Santos");
    System.out.println("Fundação: 12 de agosto de 1904");
    System.out.println("------------------------\n");
  }

  @Override
  public void showFabricInfo() {
    System.out.println("\n------- PUMA -------");
    System.out.println("Empresa: Puma SE");
    System.out.println("Fundação: 1948, Herzogenaurach, Alemanha");
    System.out.println("------------------------\n");
  }
  
}
