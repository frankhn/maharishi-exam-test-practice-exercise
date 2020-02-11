/**
 * Porcupine2
 */
public class Porcupine2 {

    public static void main(String[] args) {
        int n = 7;
        System.out.println(isPorcupineNumber(n));
    }
    static int isPorcupineNumber(int n) {
        int max = Integer.MAX_VALUE;
        int i = n;
        boolean porcupineFound = false;
        int porcupineNumber = 0;
        
            while (i<max) {
            if (isPrime(i)) {
                for (int j = i; j < max; j++) {
                    if (isPrime(j)) {
                        if (j%10 != 9) {
                           break; 
                        }
                        porcupineFound = true;
                        porcupineNumber = j;
                    }
                }
                i++;
            }
            if (porcupineFound) {
                return porcupineNumber;
            }
        }
        return porcupineNumber;
        
    }

    static boolean isPrime(int n) {
        if (n<=1) {
            return false;
        }
        boolean thePrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                thePrime = false;
                break;
            }
        }
        return thePrime;
    }
}