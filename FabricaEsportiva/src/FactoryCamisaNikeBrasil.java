import classes.CamisaNikeBrasil;
import interfaces.Camisa;
import interfaces.FactoryMethod;

public class FactoryCamisaNikeBrasil implements FactoryMethod {

  @Override
  public Camisa createTeamCamisa() {
    return new CamisaNikeBrasil();
  }

}
