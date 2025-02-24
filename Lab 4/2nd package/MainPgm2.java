package Practical4;

import Prac4_newpackage.Pgm2; 

public class MainPgm2 {
    public static void main(String[] args) {
        Pgm2 obj = new Pgm2();
        
        System.out.println("Accessing public data: " + obj.publicData);
        
        obj.publicMethod();
    }
}
