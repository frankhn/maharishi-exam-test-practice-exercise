/**
 * IsStacked
 */
public class IsStacked {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(isStacked(n));
    }

    static int isStacked(int n) {
        int isNStacked = 0;

        int sequenceSummation = 0;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sequenceSummation += i;

            if (sequenceSummation == n) {
                isNStacked = 1;
                break;
            }
             if (sequenceSummation > n) {
                break;
            }
        }
        return isNStacked;
    }
}