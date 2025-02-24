package Practical4;

import Prac4_newpackage.Pgm3;

public class MainPgm3 {
    public static void main(String[] args) {
        Pgm3 person = new Pgm3();

        System.out.println("Public name: " + person.name);
        
        person.displayPublicInfo();
        
        // Accessing default method (not accessible because it is package-private)
        // person.displayDefaultInfo(); // Uncommenting this will cause an error

        // Accessing private method (not accessible outside the class)
        // person.displayPrivateInfo(); // Uncommenting this will cause an error
    }
}
