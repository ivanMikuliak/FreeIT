package Lesson6.cosmodrome;

public class Run {
    public static void main(String[] args) {
        Cosmodrome cosmodrome = new Cosmodrome();
        cosmodrome.start(new Shattle());
        cosmodrome.start(new SpaceX());
        cosmodrome.start(new Union());
    }
}
