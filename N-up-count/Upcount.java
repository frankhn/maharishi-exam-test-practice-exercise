/**
 * Upcount
 */
public class Upcount {

    public static int up_count(int a[], int n) {
        int sum= 0;
        int previousSum = 0;
        int upCount = 0;
        for (int i = 0; i < a.length; i++) {
            previousSum = sum;
            sum += a[i];
            if (previousSum <= n && sum > n) {
                upCount +=1;
            } 
        }
        return upCount;
    }

    public static void main(String[] args) {
        int a[] = {2, 3, 1, -6, 8, -3, -1, 2};
        int n = 5;
        System.out.println(up_count(a, n));
    }
}