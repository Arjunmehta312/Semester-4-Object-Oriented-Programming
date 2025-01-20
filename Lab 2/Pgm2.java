/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical2;
import java.util.Scanner;


/**
 *
 * @author Arjun Mehta
 */
import java.util.Scanner;

public class Pgm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; n > 0; i += 2) {
            System.out.print(i + " ");
            sum += i;
            n--;
        }
        System.out.println("\nSum: " + sum);
        scanner.close();
    }
}