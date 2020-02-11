/**
 * IsMeera
 */
public class IsMeera {

    public static void main(String[] args) {
        int a[] = {2,9,9,9,7,9,0};
        System.out.println(isMeera(a));
    }

    static int isMeera(int a[]) {
        int isAMeera = 0;
        boolean hasOdd = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] %2 != 0) {
                hasOdd = true;
                break;
            }
        }
        if (hasOdd) {
           int countStartEven = 0;
           int countEndEven = 0;
           for (int j = 0; j < a.length; j++) {
               if (a[j] %2 != 0) {
                   break;
               } else {
                   countStartEven++;
               }
           }
           for (int k = a.length-1; k >=0; k--) {
               if (a[k] % 2 != 0) {
                   break;
               } else {
                   countEndEven++;
               }
           }
           if (countStartEven == countEndEven) {
               isAMeera = 1;
           } 
        }
        return isAMeera;
    }
}