package Prac4_newpackage;

public class Pgm1 {
    private int num1;
    private int num2;
    private int result;

    public Pgm1(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void addNumbers() {
        result = num1 + num2;
    }

    public void displayResult() {
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
}
