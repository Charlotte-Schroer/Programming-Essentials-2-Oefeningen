package collections.hard.h1;

public enum ScreenSmartphones {

    xLarge("> 960dp x 720dp"), large("> 640dp x 480dp"), normal("> 470dp x 320dp"), small("> 426dp x 320dp") ;

    private String screenSize;

    ScreenSmartphones(String screenSize){
        this.screenSize = screenSize;
    }
}
