package Practical3;

/**
 *
 * @author Arjun Mehta
 */
public class Pgm4 {

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;
    }

    public int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

    public void printEmirps() {
        int count = 0;
        int num = 10; 

        while (count < 100) {
            if (isPrime(num)) {
                int reversed = reverseNumber(num);
                if (isPrime(reversed) && num != reversed) {
                    System.out.print(num + " ");
                    count++;
                }
            }
            num++;
        }
    }

    public static void main(String[] args) {
        Pgm4 obj = new Pgm4();
        obj.printEmirps();
    }
}
