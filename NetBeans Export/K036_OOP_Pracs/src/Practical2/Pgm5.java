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


public class Pgm5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int exponent = scanner.nextInt();
        int result = 1;
        
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        
        System.out.println(result);
        scanner.close();
    }
}