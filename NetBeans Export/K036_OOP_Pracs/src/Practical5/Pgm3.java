/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical5;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Arjun Mehta
 */
public class Pgm3 {
    public static void main(String[] args) {
        // Creating a Vector and adding elements
        Vector<Object> vector = new Vector<>();
        vector.add(2);
        vector.add(6);
        vector.add("Hello");
        vector.add(7);
        vector.add("everyone");

        // a. Iterate through the Vector
        System.out.println("Vector elements:");
        for (Object element : vector) {
            System.out.print(element + " ");
        }
        System.out.println();

        // b. Add element at a specified index
        vector.add(2, "World");
        System.out.println("After adding 'World' at index 2: " + vector);

        // c. Check whether a given element exists in the Vector, if so, remove it
        Object elementToRemove = 6;
        if (vector.contains(elementToRemove)) {
            vector.remove(elementToRemove);
            System.out.println("After removing element '" + elementToRemove + "': " + vector);
        }

        // d. Replace an item with a new value
        vector.set(3, "Java");
        System.out.println("After replacing element at index 3 with 'Java': " + vector);

        // e. Retrieve the first and last element of the Vector
        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());
    }

}
