/**
 * SumFactor2
 */
public class SumFactor2 {

    public static void main(String[] args) {
        int a[]= {1};
        System.out.println(theFactor(a));
    }

    static int theFactor(int a[]) {
        int sum = 0;
        int sumFactorCounter = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] == sum) {
                sumFactorCounter++;
            }
        }
        return sumFactorCounter;
    }
}