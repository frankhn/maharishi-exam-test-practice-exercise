/**
 * Q3
 */
public class Q3 {

    public static char[] getResponse() {
        char[] currentArray = {'a', 'b', 'c'};
        int startPosition = 2;
        int len = 3;
        char[] newArray = currentArray.clone();
        if (len < 0 || len != currentArray.length || startPosition > len || len - startPosition < currentArray.length) return null;
        for (int i = startPosition, j =0; j < len; i++, j++) {
            newArray[j] = currentArray[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        System.out.println(getResponse());
    }
}