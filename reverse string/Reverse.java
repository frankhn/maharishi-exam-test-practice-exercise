/**
 * reverse
 */
public class Reverse {

    public static String reverseString(String string) {

        String reverse = "";
        for (int i = string.length() -1; i >= 0; i--) {
            reverse += string.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        String string = "Franklin";
        System.out.println(reverseString(string));
    }
}