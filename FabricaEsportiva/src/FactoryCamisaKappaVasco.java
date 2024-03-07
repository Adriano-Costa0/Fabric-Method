import classes.CamisaKappaVasco;
import interfaces.Camisa;
import interfaces.FactoryMethod;

public class FactoryCamisaKappaVasco implements FactoryMethod {

  @Override
  public Camisa createTeamCamisa() {
    return new CamisaKappaVasco();
  }

}
