package inheritance.beestjes.soorten;

import inheritance.beestjes.Reptiel;

import java.time.LocalDate;
import java.util.Date;

public class Slang extends Reptiel {

    public Slang(LocalDate geboortedatum){
        super(geboortedatum);
    }

    @Override
    public String maakGeluid() {
        return "Ssssssssss!";
    }


}
