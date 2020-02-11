/**
 * perfectSquare
 */
public class perfectSquare {

    public static int perfectSquareNumbers(int n) {
        for (int i = 0; i < n; i++) {
            if (i * i == n) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 49;
        System.out.println(perfectSquareNumbers(n));
    }
}