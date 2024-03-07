
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import interfaces.Camisa;
import interfaces.FactoryMethod;

public class Main {

  public static void main(String[] args) throws IOException {

    Map<String, String> products = new HashMap<String, String>();

    products.put("1", "Brasil");
    products.put("2", "Flamengo");
    products.put("3", "Botafogo");
    products.put("4", "Fluminense");
    products.put("5", "Vasco");

    System.out.println("----- Distribuidora de Camisas -----\n");

    System.out.println("\nInforme qual o time: \n");

    for (String key : products.keySet()) {
      System.out.println("[" + key + "] " + products.get(key));
    }

    BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));

    String code = reader.readLine();

    if (products.containsKey(code)) {

      switch (code) {
        case "1":
          FactoryMethod nike = new FactoryCamisaNikeBrasil();
          Camisa camisaBrasil = nike.createTeamCamisa();

          camisaBrasil.showTeamInfo();
          camisaBrasil.showFabricInfo();
          break;
        case "2":
          FactoryMethod adidas = new FactoryCamisaAdidasFlamengo();
          Camisa camisaFlamengo = adidas.createTeamCamisa();

          camisaFlamengo.showTeamInfo();
          camisaFlamengo.showFabricInfo();
          break;
        case "3":
          FactoryMethod puma = new FactoryCamisaPumaBotafogo();
          Camisa camisaBotafogo = puma.createTeamCamisa();

          camisaBotafogo.showTeamInfo();
          camisaBotafogo.showFabricInfo();
          break;
        case "4":
          FactoryMethod umbro = new FactoryCamisaUmbroFluminense();
          Camisa camisaFluminense = umbro.createTeamCamisa();

          camisaFluminense.showTeamInfo();
          camisaFluminense.showFabricInfo();
          break;
        case "5":
          FactoryMethod kappa = new FactoryCamisaKappaVasco();
          Camisa camisaVasco = kappa.createTeamCamisa();

          camisaVasco.showTeamInfo();
          camisaVasco.showFabricInfo();
          break;

        default:
          break;
      }

    } else {
      System.err.println("\nTime invalido !!!\n");
    }

  }
}