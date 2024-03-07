import classes.CamisaAdidasFlamengo;
import interfaces.Camisa;
import interfaces.Factory;

public class FactoryCamisaAdidasFlamengo implements Factory {

  @Override
  public Camisa createTeamCamisa() {
    return new CamisaAdidasFlamengo();
  }

}
