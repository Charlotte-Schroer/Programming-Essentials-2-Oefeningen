package extra.oef1;

public enum StatusApplicatie {
    STARTED, PAUSED, STOPPED, UNREACHABLE;

    public void run(){
        System.out.println(this.name());
    }
}
