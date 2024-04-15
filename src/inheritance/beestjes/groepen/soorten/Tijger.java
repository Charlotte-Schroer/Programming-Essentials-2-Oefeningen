package inheritance.beestjes.groepen.soorten;

import inheritance.beestjes.groepen.Zoogdier;

import java.time.LocalDate;

public class Tijger extends Zoogdier {

    public Tijger(LocalDate geboortedatum){
        super(geboortedatum);
    }

    @Override
    public String maakGeluid() {
        return "Roooaaawrrhh!";
    }


}
