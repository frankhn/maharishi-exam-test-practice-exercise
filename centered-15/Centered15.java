/**
 * Centered-15
 */
public class Centered15 {
    public static void main(String[] args) {
        int a[] = { 3, 6, 10, 4, 1, 6, 9 };
        System.out.println(centered(a));
    }
    static int centered(int a[]) {

        int lowerIndex = 0;
        int upperIndex = 0;
        int isCentered = 0;

        if (a.length % 2 == 0) {
            lowerIndex = (a.length / 2) - 1;
            upperIndex = a.length / 2;
        } else {
            lowerIndex = (a.length - 1) / 2;
            upperIndex = lowerIndex;
        }

        while (lowerIndex > 0 && upperIndex < a.length) {
            int sum = 0;
            for (int i = lowerIndex; i <= upperIndex; i++) {
                sum += a[i];
            }
            if (sum == 15) {
                isCentered = 1;
                break;
            }
            lowerIndex--;
            upperIndex++;
        }
        return isCentered;
    }
}