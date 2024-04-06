package inheritance.beestjes.soorten;

import inheritance.beestjes.Vogel;
import inheritance.beestjes.Zoogdier;

import java.util.Date;

public class Vleermuis extends Zoogdier {

    public Vleermuis(Date geboortedatum){
        super(geboortedatum);
    }

    @Override
    public String maakGeluid() {
        return "Vleermuuuuuiiiiiis!!!";
    }
}
