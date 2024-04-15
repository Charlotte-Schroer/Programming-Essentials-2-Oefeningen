package inheritance.beestjes.groepen.soorten;

import inheritance.beestjes.groepen.Reptiel;

import java.time.LocalDate;

public class Slang extends Reptiel {

    public Slang(LocalDate geboortedatum){
        super(geboortedatum);
    }

    @Override
    public String maakGeluid() {
        return "Ssssssssss!";
    }


}
