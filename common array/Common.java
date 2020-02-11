import java.util.Arrays;

/**
 * Common
 */
public class Common {

    public static String common(int a[], int b[]) {
        int arr[] = new int[a.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    arr[count] = a[i];
                    count++;
                }
            }
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        int array1[] = {1,3,4,5,6,7};
        int array2[] = {1,9,4,0,2,7};

        System.out.println(common(array1, array2));
    }
}