import classes.CamisaPumaBotafogo;
import interfaces.Camisa;
import interfaces.Factory;

public class FactoryCamisaPumaBotafogo implements Factory {

  @Override
  public Camisa createTeamCamisa() {
    return new CamisaPumaBotafogo();
  }

}
