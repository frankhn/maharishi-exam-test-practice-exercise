/**
 * GoodSpread
 */
public class GoodSpread {

    public static void main(String[] args) {
        int [] a = {4,4,9,7,4,4,6};
        System.out.println(isGoodSpread(a));
    }

    static int isGoodSpread(int a[]) {
        int isSpreadGood = 1;

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > 3) {
                isSpreadGood = 0;
                break;
            }
        }
        return isSpreadGood;
    }
}