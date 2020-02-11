/**
 * IsMadhav
 */
public class IsMadhav {
    public static int ismadhav(int a[]) {
        int ArrayLength = a.length;
        int sum = a[0];
        int startIndex = 0;
        int endIndex = 0;
        int n = 1;
        boolean ismadhavArray = true;
        int currentArrayLength = 1;

        while (currentArrayLength <= ArrayLength) {
            int boundArraySum = 0;
            for (int i = startIndex; i <= endIndex; i++) {
                boundArraySum += a[i];
            }
            startIndex = endIndex + 1;
            endIndex = startIndex + n;
            n++;
            if (boundArraySum != sum) {
                ismadhavArray = false;
            }
            currentArrayLength++;
        }


        if (ismadhavArray) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int a[] = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
        System.out.println(ismadhav(a));
    }
}