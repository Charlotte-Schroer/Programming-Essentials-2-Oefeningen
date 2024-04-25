package extra.oef3;

import java.util.*;

public class ProductManager<T> {
    private Map<String, ArrayList<T>> toestellen;

    public ProductManager(){
        toestellen = new HashMap<>();
        toestellen.put("Smartwatches", new ArrayList<>());
        toestellen.put("Smartphones", new ArrayList<>());
    }

    public void addSmartphone(Smartphone smartphone){
        toestellen.get("Smartphones").add((T) smartphone);
    }
    public void addSmartwatch(Smartwatch smartwatch){
        toestellen.get("Smartwatches").add((T) smartwatch);
    }

    @Override
    public String toString() {
        return "ProductManager" + toestellen;
    }

    public void sortByName(){
        for (ArrayList<T> list : toestellen.values()){
            Collections.sort(list, new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    if(o1 instanceof Product && o2 instanceof Product){
                        String naam1 = ((Product) o1).getMerknaam();
                        String naam2 = ((Product) o2).getMerknaam();
                        return naam1.compareTo(naam2);
                    }
                    return 0;
                }
            });
        }
    }

    public void sortByPrice(){
        for (ArrayList<T> list : toestellen.values()){
            Collections.sort(list, new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    if(o1 instanceof Product && o2 instanceof Product){
                        int prijs1 = ((Product)o1).getPrijs();
                        int prijs2 = ((Product)o2).getPrijs();
                        return Integer.compare(prijs1, prijs2);
                    }
                    return 0;
                }
            });
        }
    }

}
