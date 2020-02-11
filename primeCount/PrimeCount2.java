/**
 * PrimeCount2
 */
public class PrimeCount2 {

    public static int primeCounter(int start, int end) {
        int counter = 0;
        if (start == 0 || start == 1) {
            return counter;
        }
        if (start < 1) {
            start = 2;
        }
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                   isPrime = false; 
                }
            }
            if (isPrime) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int start = -10;
        int end = 6;
        System.out.println(primeCounter(start, end));
    }
}