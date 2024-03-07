import classes.CamisaUmbroFluminense;
import interfaces.Camisa;
import interfaces.Factory;

public class FactoryCamisaUmbroFluminense implements Factory {

  @Override
  public Camisa createTeamCamisa() {
    return new CamisaUmbroFluminense();
  }

}
