package inheritance.beestjes.soorten;

import inheritance.beestjes.Vogel;
import inheritance.beestjes.Zoogdier;

import java.time.LocalDate;
import java.util.Date;

public class Vleermuis extends Zoogdier {

    public Vleermuis(LocalDate geboortedatum){
        super(geboortedatum);
    }

    @Override
    public String maakGeluid() {
        return "Vleermuuuuuiiiiiis!!!";
    }

    public void vlieg(){
        System.out.println("Vleermuis: " + maakGeluid());
    }
}
