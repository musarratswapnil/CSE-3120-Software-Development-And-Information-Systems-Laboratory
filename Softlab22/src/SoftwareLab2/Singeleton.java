package SoftwareLab2;

public class Singeleton {
    private static final Singeleton instance = new Singeleton();

    private Singeleton(){}

    public static Singeleton getInstance() {
        return instance;
    }
}