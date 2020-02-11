/**
 * SumFactor
 */
public class SumFactor {
    public static int sumFactors(int n[]) {
        int sumFactorOccurrence = 0;
        int arraySum = 0;

        for (int i = 0; i < n.length; i++) {
            arraySum += n[i];
        }

        for (int j = 0; j < n.length; j++) {
            if (n[j] == arraySum) {
                sumFactorOccurrence++;
            }
        }
        
        return sumFactorOccurrence;
    }

    public static void main(String[] args) {
        int a[] = {3, 0, 2, -5, 0}; 
        System.out.println(sumFactors(a));
    }
}