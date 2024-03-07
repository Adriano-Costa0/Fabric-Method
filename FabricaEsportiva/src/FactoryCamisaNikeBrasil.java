import classes.CamisaNikeBrasil;
import interfaces.Camisa;
import interfaces.Factory;

public class FactoryCamisaNikeBrasil implements Factory {

  @Override
  public Camisa createTeamCamisa() {
    return new CamisaNikeBrasil();
  }

}
