package Prac4_newpackage;

public class Pgm3 {
    public String name = "John Doe"; 
    private int age = 25;

    public void displayPublicInfo() {
        System.out.println("Name: " + name);
    }

    void displayDefaultInfo() {
        System.out.println("Age: " + age);
    }

    private void displayPrivateInfo() {
        System.out.println("Private method: Age is " + age);
    }
}
