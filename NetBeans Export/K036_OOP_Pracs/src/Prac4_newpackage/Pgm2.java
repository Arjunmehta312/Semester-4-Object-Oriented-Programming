package Prac4_newpackage;

public class Pgm2 {
    public int publicData = 100;
    private int privateData = 200;

    public void publicMethod() {
        System.out.println("Public Method: publicData = " + publicData);
    }

    private void privateMethod() {
        System.out.println("Private Method: privateData = " + privateData);
    }
}
