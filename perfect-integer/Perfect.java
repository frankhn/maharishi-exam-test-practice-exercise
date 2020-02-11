/**
 * Perfect
 */
public class Perfect {

    public static String perfect(int x) {

        for (int i = 0, j = 0; i < x/2 && j<x/2; i++, j++) {
                if (i*j == x) {
                    return "perfect integer because " + i + "*" + j + " is equal to "+ x;
                }
        }
        return " Oops!!! Not a perfect number";
    }
    public static void main(String[] args) {
        int n = 49;
        System.out.println(perfect(n));
    }
}