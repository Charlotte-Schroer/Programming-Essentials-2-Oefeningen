package classes;
/*
Op een BankRekening staat een bepaald bedrag.
Voorzie een default constructor die dat bedrag op 0.0 zet, en een tweede constructor die toelaat om een positieve double door te geven.
 Als er een negatief getal doorgegeven wordt, mag je het bedrag van de bankrekening op 0 zetten.

Voorzie een getter en setter voor het bedrag.
We laten niet toe dat de gebruiker de setter zelf mag gebruiken, gebruik de juiste zichtbaarheid dat de setter enkel binnen deze klasse zelf gebruikt kan worden.

Voorzie methoden om geld te storten en om geld af te halen.
Bij een afhaling mag je onder 0 gaan, maar niet meer dan 1000 euro. Als dat wel het geval zou zijn, mag je de afhaling weigeren en voert de functie niets uit.
Druk in dat geval een foutmelding af in de console.
 */
public class   Bankrekening {
    private double bedrag;

    private Bankrekening(){
        bedrag = 0.0;
    }
    private Bankrekening(double bedrag){
        if(bedrag>0.0){
        setBedrag(bedrag);}
        else {bedrag = 0.0;}
    }

  private double getBedrag() {
        return bedrag;
    }

    private void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }

    private void stortenBankrekening(double gestortBedrag){
        bedrag += gestortBedrag;
    }

    private void afhalenBankrekening(double afhaling){
        bedrag -= afhaling;
        if(bedrag < -1000){
            System.out.println("Error, te weinig geld, afhaling geweigerd");
            bedrag += afhaling;
        }
    }

    @Override
    public String toString(){
        return "De bankrekening heeft een bedrag van: " + bedrag;
    }

    public static void main(String[] args){
        Bankrekening kbc = new Bankrekening(25.36);
        System.out.println(kbc);
        kbc.setBedrag(85.36);
        System.out.println(kbc);
        kbc.afhalenBankrekening(9638);
        System.out.println(kbc);
        kbc.stortenBankrekening(25.3);
        System.out.println(kbc);
    }
}

