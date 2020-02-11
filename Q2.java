/**
 * Q2
 */
public class Q2 {

    public static int getDifference() {
        int[] currentArrays = { 2, 4, 5, 9};

        int sumOdd = 0;
        int sumEven = 0;

        for (int i=0; i < currentArrays.length; i++) {
            if (currentArrays[i] %2 == 0) {
                sumEven += currentArrays[i];
            } else {
            sumOdd += currentArrays[i];
            }
        }

        return sumOdd - sumEven;
    }

    public static void main(String[] args) {
        System.out.println(getDifference());
    }
}