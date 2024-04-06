package inheritance.beestjes.soorten;

import inheritance.beestjes.Reptiel;

import java.util.Date;

public class Slang extends Reptiel {

    public Slang(Date geboortedatum){
        super(geboortedatum);
    }

    @Override
    public String maakGeluid() {
        return "Ssssssssss!";
    }


}
