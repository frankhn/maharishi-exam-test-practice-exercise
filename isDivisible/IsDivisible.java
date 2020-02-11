//  Write a method named isDivisible that takes an integer array and a divisor and returns 1 if all its elements are divided
// by the divisor with no remainder. Otherwise it returns 0.

public class IsDivisible {

    public static void main(String[] args) {
        int a[] = {6, 12, 24, 36};
        int n = 12;
        System.out.println(isDivisible(a, n));

    }


    static int isDivisible(int a[], int n) {
        System.out.println(a[0]%n);
        int isCorrect = 1;
        for (int i = 0; i < a.length; i++) {
            
            if (a[i]% n != 0) {
                isCorrect = 0;
                break;
            }
        }
        return isCorrect;
    }
}