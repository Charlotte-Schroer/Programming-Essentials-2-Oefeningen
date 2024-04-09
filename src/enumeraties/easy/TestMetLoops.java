package enumeraties.easy;

public class TestMetLoops {
    public static void main(String[] args) {
        StatusApplicatie statusApplicatie[] =  StatusApplicatie.values();

        for(int i = 0; i<StatusApplicatie.values().length; i++){
        statusApplicatie[i].run();
        }

    }
}
