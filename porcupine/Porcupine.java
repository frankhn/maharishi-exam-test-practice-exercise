// 2. A prime number is an integer that is divisible only by 1 and itself. A porcupine number is a prime number whose last digit is 9
// and the next prime number that follows it also ends with the digit 9. For example 139 is a porcupine number because:
//  a. it is prime
//  b. it ends in a 9
//  c. The next prime number after it is 149 which also ends in 9. Note that 140, 141, 142, 143, 144, 145, 146, 147 and 148 are not
// prime so 149 is the next prime number after 139.
// Write a method named findPorcupineNumber which takes an integer argument n and returns the first porcupine number that is
// greater than n. So findPorcupineNumber(0) would return 139 (because 139 happens to be the first porcupine number) and so would
// findPorcupineNumber(138). But findPorcupineNumber(139) would return 409 which is the second porcupine number.
public class Porcupine {

    public static boolean isPrime(int n) {
        boolean isPrimeFromA = true;
        for (int i = 0; i < n/2; i++) {
            if (n % i == 0) {
                isPrimeFromA = false;
            }
        }
        return isPrimeFromA;
    }

    public static int isPorcupine(int a) {

        int max = Integer.MAX_VALUE;
        // boolean isPorcupine = false;
        int number = 0;
        a++;

        System.out.println(isPrime(n));

        while (isPrime(a) && a %10 ==9) {
                for (int i = a; i < max; i++) {
                    if (isPrime(i) && i %10 != 9) { // next prime number
                    //    isPorcupine = false;
                    System.out.println(i);
                       number = i;
                       break;
                    }
                    // isPorcupine = true;
                    break;
            }
            a++;
        }
        return number;
               
    }
    public static void main(String[] args) {
        int a = 0;
       isPorcupine(a);
    }
}