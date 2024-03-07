import classes.CamisaPumaBotafogo;
import interfaces.Camisa;
import interfaces.FactoryMethod;

public class FactoryCamisaPumaBotafogo implements FactoryMethod {

  @Override
  public Camisa createTeamCamisa() {
    return new CamisaPumaBotafogo();
  }

}
