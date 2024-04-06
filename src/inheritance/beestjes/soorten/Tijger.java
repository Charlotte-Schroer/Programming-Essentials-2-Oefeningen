package inheritance.beestjes.soorten;

import inheritance.Zwembad;
import inheritance.beestjes.Zoogdier;

import java.util.Date;

public class Tijger extends Zoogdier {

    public Tijger(Date geboortedatum){
        super(geboortedatum);
    }

    @Override
    public String maakGeluid() {
        return "Roooaaawrrhh!";
    }


}
