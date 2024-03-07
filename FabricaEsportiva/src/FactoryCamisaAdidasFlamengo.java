import classes.CamisaAdidasFlamengo;
import interfaces.Camisa;
import interfaces.FactoryMethod;

public class FactoryCamisaAdidasFlamengo implements FactoryMethod {

  @Override
  public Camisa createTeamCamisa() {
    return new CamisaAdidasFlamengo();
  }

}
