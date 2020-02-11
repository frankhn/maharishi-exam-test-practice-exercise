/**
 * EvenOddDiff
 */
public class EvenOddDiff {

    public static void main(String[] args) {
        int a[] = {5,6,1, 9,3,8};

        System.out.println(diff(a));
    }

    static int diff(int a[]) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                x += a[i];
            } else {
                y += a[i];
            }
        }
        return x-y;
    }
}