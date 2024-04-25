package extra.oef1;

public class TestStatusApplicatie {
    public static void main(String[] args) {

        StatusApplicatie[] statusApplicaties = StatusApplicatie.values();

        for (int i=0; i<statusApplicaties.length; i++){
            statusApplicaties[i].run();
        }
    }
}
