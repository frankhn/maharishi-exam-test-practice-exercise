/**
 * FoctorTwoCount
 */
public class FoctorTwoCount {

    public static void main(String[] args) {
        int n = 23;
        System.out.println(factorTwoCount(n));
    }

    static int factorTwoCount(int n) {
        int count = 0;
        if (n%2 !=0) {
            return count;
        } else {
            while (n>=2) {
                if (n%2 !=0) {
                    break;
                } else {
                    count++;
                }
                // System.out.println(n);
                n = n/2;
            }
        }
        return count;
    }
    
}