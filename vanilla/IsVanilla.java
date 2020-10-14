/**
 * IsVanilla
 */
public class IsVanilla {

    public static void main(String[] args) {
        int a[] = {1,11,11,11,111,1,1,1111};
        System.out.println(isVanilla(a));
    }

    static int isVanilla(int a[]) {
        boolean isVanilla = true;
        int firstDigit = 0;
        int secondDigit = 0;

        firstDigit = a[0] % 10;

        for (int i = 0; i < a.length; i++) {

            while (a[i] != 0) {
                // System.out.println(a[i]);
                secondDigit = a[i] % 10;
                // System.out.println(secondDigit);

                if(a[i] != firstDigit || secondDigit != firstDigit) {
                    isVanilla = false;
                    break;
                }
                a[i] /= 10;
            }
        }
        if (isVanilla) {
            return 1;
        }
        return 0;
    }
}