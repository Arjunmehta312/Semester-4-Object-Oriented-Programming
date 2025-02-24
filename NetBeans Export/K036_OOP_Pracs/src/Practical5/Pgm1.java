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
public class Pgm1 {
    public static int getBestScore(int[] scores) {
        int best = scores[0];
        for (int score : scores) {
            if (score > best) {
                best = score;
            }
        }
        return best;
    }
    
    public static char getGrade(int score, int best) {
        if (score >= best - 10) {
            return 'A';
        } else if (score >= best - 20) {
            return 'B';
        } else if (score >= best - 30) {
            return 'C';
        } else if (score >= best - 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        int[] scores = new int[numStudents];

        System.out.print("Enter " + numStudents + " scores: ");
        for (int i = 0; i < numStudents; i++) {
            scores[i] = scanner.nextInt();
        }

        int best = getBestScore(scores);

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + getGrade(scores[i], best));
        }

        scanner.close();
    }

}
    