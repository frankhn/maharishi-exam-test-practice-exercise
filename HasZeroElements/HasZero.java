/**
 * HasZero
 */
public class HasZero {

    public static void main(String[] args) {
        int a[]= {4,4,6,6,2,30};
        System.out.println(hasZeroElement(a));
    }

    static int hasZeroElement(int a[]) {
        int zeroFound = 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                zeroFound = 0;
                break;
            }
        }
        return zeroFound;
    }
}