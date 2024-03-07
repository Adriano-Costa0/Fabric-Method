import classes.CamisaKappaVasco;
import interfaces.Camisa;
import interfaces.Factory;

public class FactoryCamisaKappaVasco implements Factory {

  @Override
  public Camisa createTeamCamisa() {
    return new CamisaKappaVasco();
  }

}
