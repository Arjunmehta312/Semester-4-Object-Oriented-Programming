package Practical3;

/**
 *
 * @author Arjun Mehta
 */
public class Pgm3 {

    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public double multiply(int a, double b) {
        return a * b;
    }

    public double multiply(double a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Pgm3 obj = new Pgm3();
        System.out.println("sMultiplication of two integers: " + obj.multiply(5, 4));
        System.out.println("Multiplication of three integers: " + obj.multiply(2, 3, 4));
        System.out.println("Multiplication of integer and double: " + obj.multiply(5, 3.5));
        System.out.println("Multiplication of double and integer: " + obj.multiply(3.5, 5));
    }
}
