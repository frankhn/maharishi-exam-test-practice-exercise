/**
 * reverse
 */
public class Reverse {

    public static String reverseString(String str) {

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
            reverse += str.charAt(i);
        }
        return reverse;
    }

    static Integer reverseNumber(Integer num) {
    int reversed = 0;

    // run loop until num becomes 0
    while (num != 0) {
        // get last digit from num
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        System.out.println("revesed: " + reversed + "digit: " + digit + "num: " + (num /= 10));

        // remove the last digit from num
        num /= 10;
    }
    return reversed;
    }

    public static void main(String[] args) {
        // String string = "Franklin";
        // System.out.println(reverseString(string));
        int num = 12345;
        System.out.println(reverseNumber(num));
    }
}