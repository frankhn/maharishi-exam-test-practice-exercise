/**
 * PimeCount
 */
public class PrimeCount {

    public static int primeCount(int start, int end) {
        int primeCount = 0;
        for (int i = start; i <= end; i++) {

            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
                if (isPrime) {
                    primeCount ++;
                }
                
        }
        return primeCount;
    }

    public static void main(String[] args) {
        int start = 10, end = 30;
        System.out.println(primeCount(start, end));
    }
}