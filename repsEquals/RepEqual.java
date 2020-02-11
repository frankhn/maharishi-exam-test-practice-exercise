/**
 * RepEqual
 */
public class RepEqual {

    public static void main(String[] args) {
        int a[] = {3,2,0,5,3};
        int n = 32053;
        System.out.println(isReqEqual(a, n));
    }

    static int isReqEqual(int a[], int n) {
        // check the last number

        boolean isRep = true;

        int nIndex = 0;

        for (int i = a.length -1; i >=0; i--) {
            nIndex = n %10 ;
            if (nIndex != a[i]) {
                isRep = false;
                break;
            }
            n = n / 10;
        }
        if (isRep) {
            return 1;
        }
        return 0;
    }
}