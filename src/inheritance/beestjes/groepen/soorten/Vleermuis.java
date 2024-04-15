package inheritance.beestjes.groepen.soorten;

import inheritance.beestjes.groepen.Zoogdier;

import java.time.LocalDate;

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
