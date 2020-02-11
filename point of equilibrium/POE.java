/**
 * POE
 */
public class POE {

    public static int equivalent(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            int leftSum = 0;

            for (int j = 0 ; j <i; j++) {
                leftSum += arr[j];
                
            int rightSum = 0;

            for (int j2= arr.length-1; j2 >i; j2--) {
                rightSum += arr[j2];
                // System.out.println(" left summation " +leftSum);
                // System.out.println(" right summations " +rightSum);
            if (leftSum == rightSum) {
                return i;
            }
            }
        }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 10, 1, 2};
        System.out.println(equivalent(arr)); 
    }
}