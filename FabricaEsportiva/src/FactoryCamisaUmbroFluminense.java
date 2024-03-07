import classes.CamisaUmbroFluminense;
import interfaces.Camisa;
import interfaces.FactoryMethod;

public class FactoryCamisaUmbroFluminense implements FactoryMethod {

  @Override
  public Camisa createTeamCamisa() {
    return new CamisaUmbroFluminense();
  }

}
