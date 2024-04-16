package classes;

public class BankrekeningSecondTry {

    private double bedrag;

    private double getBedrag() {
        return bedrag;
    }

    private void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }

    public BankrekeningSecondTry(double bedrag){
        if(bedrag>=0.0){
            this.bedrag = bedrag;
         } else {this.bedrag = 0.00;
            }
    }
    public BankrekeningSecondTry(){
        this.bedrag = 0.00;
    }

    public void afhaling(double bedragAfTehalen){
        bedrag-= bedragAfTehalen;
        if(bedrag < -1000 ){
              System.out.println("Foutmelding!");
              bedrag+=bedragAfTehalen;
        }
    }

    public void storting(double bedragTeStorten){
        bedrag+=bedragTeStorten;
    }
}
