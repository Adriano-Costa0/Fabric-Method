package classes;

import interfaces.Camisa;

/**
 * CamisaAdidasFlamengo
 */
public class CamisaAdidasFlamengo implements Camisa {

  @Override
  public void showTeamInfo() {
    System.out.println("\n------- FLAMENGO -------");
    System.out.println("Arena/Estádio: Maracanã");
    System.out.println("Fundação: 15 de novembro de 1895;");
    System.out.println("------------------------\n");
  }
  
  @Override
  public void showFabricInfo() {
    System.out.println("\n------- ADIDAS -------");
    System.out.println("Empresa: Adidas");
    System.out.println("Fundação: 18 de agosto de 1949, Herzogenaurach, Alemanha");
    System.out.println("------------------------\n");
  }

}