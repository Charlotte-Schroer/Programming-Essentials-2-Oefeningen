package enumeraties.easy;

public enum StatusApplicatie {
    STARTED, PAUSED, STOPPED, UNREACHABLE;

    public void run(){
        System.out.println(this.name());
    }
}
