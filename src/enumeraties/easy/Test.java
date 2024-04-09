package enumeraties.easy;

public class Test {
    public static void main(String[] args) {
        StatusApplicatie startedButton = StatusApplicatie.STARTED;
        startedButton.run();
        StatusApplicatie pauseButton = StatusApplicatie.PAUSED;
        pauseButton.run();
        StatusApplicatie stoppedButton = StatusApplicatie.STOPPED;
        stoppedButton.run();
        StatusApplicatie unreachableButton = StatusApplicatie.UNREACHABLE;
        unreachableButton.run();
    }
}
