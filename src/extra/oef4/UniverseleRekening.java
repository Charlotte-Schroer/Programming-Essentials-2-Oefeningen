package extra.oef4;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class UniverseleRekening{
   private Bankrekening bankrekening;
   private ArrayList<Persoon> volmachthouders;

   public UniverseleRekening(){
       this.bankrekening = new Bankrekening();
       this.volmachthouders = new ArrayList<>();
   }
   public UniverseleRekening(Bankrekening bankrekening, ArrayList<Persoon> volmachthouders ){
       this.bankrekening = bankrekening;
       this.volmachthouders = volmachthouders;
   }

   public void toevoegenVolmacht(Persoon persoon){
       volmachthouders.add(persoon);
   }

   public void verwijderVolmacht(Persoon persoon) throws PersoonHeeftGeenVolmacht{
       if (controleerVolmacht(persoon)){
           volmachthouders.remove(persoon);
       } else {
           throw new PersoonHeeftGeenVolmacht("Persoon heeft geen volmacht");
       }
   }

   public boolean controleerVolmacht(Persoon persoon){
       if(volmachthouders.contains(persoon)){
           return true;
       } else {
           return false;
       }
   }

   public void geldAfhalenUniverseleRekening(Persoon persoon, int bedrag) throws OntoereikendSaldo, PersoonHeeftGeenVolmacht {
       if(controleerVolmacht(persoon)){
           bankrekening.geldafhaling(bedrag);
       } else {
           throw new PersoonHeeftGeenVolmacht("Persoon heeft geen volmacht");
       }
   }

   public void geldStortenUniverseleRekening(int bedrag){
       bankrekening.stortGeld(bedrag);
   }

   public List<Persoon> toonVolmachthebbers(){
       List<Persoon> volmachthebberslijst = new ArrayList<>(volmachthouders);
       volmachthebberslijst.sort(Persoon::sorteerOpNaam);
       return volmachthebberslijst;
   }

    @Override
    public String toString() {
        return "UniverseleRekening{" +
                "bankrekening=" + bankrekening +
                ", volmachthouders=" + volmachthouders +
                '}';
    }

}
