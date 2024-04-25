package extra.oef4;

public class Bankrekening {

    private int saldo; //saldo op bankrekening in cent

    public Bankrekening(int saldo){
        if(saldo<0){
            this.saldo=0;
        } else {
            this.saldo = saldo;
        }
    }

    public Bankrekening(){
        this.saldo = 0;
    }

    public int getSaldo() {
        return saldo;
    }

    private void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void stortGeld(int bedrag){ //in cent
        saldo+=bedrag;
    }

    public void geldafhaling(int bedrag) throws OntoereikendSaldo {//in cent
        saldo-=bedrag;
        if(saldo<-100000){
            saldo+=bedrag;
            throw new OntoereikendSaldo("Bij een afhaling mag u onder 0 gaan, maar niet meer dan €1000.");
        }
    }

    @Override
    public String toString() {
        return "Bankrekening met saldo: €" + (double)saldo/100;
    }

    public static void main(String[] args) {
        Bankrekening b1 = new Bankrekening(56931);
        System.out.println(b1);
        b1.stortGeld(53691);
        System.out.println(b1);
        try{
            b1.geldafhaling(896324);
        } catch (OntoereikendSaldo ignored){

        }

        System.out.println(b1);
    }
}
