/**
 * IsInertial
 */
public class IsInertial {
    public static int isInertial(int a[]) {
        boolean isInertial = true;
        boolean hasOdd = false;
        int max = 0;


        for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 != 0) {
                    hasOdd = true;
            }
        }
            if (hasOdd) {
                for (int k = 0; k < a.length; k++) {
                    if (a[k] > max) {
                        max = a[k];
                    }
                }
                if (max % 2 == 0) {
                   for (int j = 0; j < a.length; j++) {
                       if (a[j] % 2 != 0) {
                           for (int j2 = 0; j2 < a.length; j2++) {
                               if (a[j2] % 2 == 0 && a[j] < a[j2] && a[j2] != max) {
                                  isInertial = false; 
                               }
                           }
                       }
                   }
                } else {
                    isInertial = false;
                }
            } else {
                isInertial = false;
            }
        if (isInertial) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int a[] = {2};
        System.out.println(isInertial(a));
    }
}