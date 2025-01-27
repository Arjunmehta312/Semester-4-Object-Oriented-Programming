package Practical3;

/**
 *
 * @author Arjun Mehta
 */
public class Pgm2 {

    public void printArea(int side) {
        int area = side * side;
        System.out.println("Area of square with side " + side + " is: " + area);
    }

    public void printArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of rectangle with length " + length + " and breadth " + breadth + " is: " + area);
    }

    public static void main(String[] args) {
        Pgm2 obj = new Pgm2();
        obj.printArea(5);
        obj.printArea(4, 6);
    }
}
