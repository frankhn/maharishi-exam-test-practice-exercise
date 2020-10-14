/**
 * FoctorTwoCount
 * 
 * Calculates factors of a Numbers eg: 10 factors 1
 * since 10/2 = 5  5%2 != 0  
 */
public class FoctorTwoCount {

    public static void main(String[] args) {
        int n = 10;
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
                System.out.println(n);
                n = n/2;
            }
        }
        return count;
    }
    
}