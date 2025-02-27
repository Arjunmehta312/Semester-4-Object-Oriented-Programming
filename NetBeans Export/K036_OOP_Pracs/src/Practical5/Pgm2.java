/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical5;
import java.util.Scanner;

/**
 *
 * @author Arjun Mehta
 */
public class Pgm2 {
    public static boolean isInArray(int[] array, int count, int num) {
        for (int i = 0; i < count; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }
    
    public static int[] getDistinctNumbers(int[] numbers) {
        int[] distinct = new int[numbers.length];
        int count = 0;
        
        for (int num : numbers) {
            if (!isInArray(distinct, count, num)) {
                distinct[count] = num;
                count++;
            }
        }

        int[] result = new int[count];
        System.arraycopy(distinct, 0, result, 0, count);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] distinctNumbers = getDistinctNumbers(numbers);

        System.out.print("The distinct numbers are: ");
        for (int num : distinctNumbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

}
