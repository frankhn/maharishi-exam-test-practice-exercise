/**
 * Second
 */
public class Second {

    public static void main(String[] args) {
        int a[] = {4,3,1,2};
        System.out.println(theSecond(a));
    }

    static int theSecond(int a[]) {
        int max = 0;
        int secMax = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > secMax && a[i] <max) {
                secMax = a[i];
            }
        }

        return secMax;
    }
}