/**
 * partialSum
 */
public class PartialSum {

    public static int upCountCalculator(int a[], int n) {
        int ps = 0;
        int upc = 0;

        for (int i = 0; i < a.length; i++) {
            if (ps <= n && ps + a[i] > n) {
                upc++;
            } 
            ps += a[i];
        }
        return upc;
    }



    public static void main(String[] args) {
        int a[] = {2, 3, 1, -6, 8, -3, -1, 2};
        int n = 5;
        System.out.println(upCountCalculator(a, n));
    }
}