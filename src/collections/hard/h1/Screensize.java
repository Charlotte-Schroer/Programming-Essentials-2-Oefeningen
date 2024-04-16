package collections.hard.h1;

public enum Screensize {

    XLARGE(960, 720), LARGE(640, 480), NORMAL(470, 320), Small(426, 320);

    private int width;
    private int height;

    Screensize(int width, int height){
        this.width = width;
        this.height = height;
    }

    public static Screensize getScreenSize(int width, int height){
        for (Screensize screensize : Screensize.values()){
            if (width> screensize.width && height > screensize.height){
                return screensize;
            }
        }
        return null;
    }

}
