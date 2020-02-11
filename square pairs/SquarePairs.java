/**
 * SquarePairs
 */
public class SquarePairs {

    public static void main(String[] args) {
        int a[] = {9};
        System.out.println(squareParies(a));

    }
    static int squareParies(int a[]) {
        int pairCounter = 0;
        int i = 0;

         while (i < a.length) {
             for (int j = 0; j < a.length; j++) {
                 int sum = a[i] + a[j];
                 if (a[i]<a[j] && a[j] != a[i] && a[i]>0 && a[j] >0) {
                     
                     for (int k = 0; k < sum/2; k++) {
                        if (k * k == sum) {
                            pairCounter++;
                            System.out.print("  "+ a[i]+ " pair "+ a[j]+ "\n");
                        } 
                     }
                 }
             }
             i++;
             
         } 

         return pairCounter; 
    }
}