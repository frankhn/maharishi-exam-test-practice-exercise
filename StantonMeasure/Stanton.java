/**
 * Stanton
 */
public class Stanton {
    public static int stantonMeasure(int n[]) {
        int stantonMeasure = 0;
        int occurrenceOfOnes = 0;

        for (int i = 0; i < n.length; i++) {
            if (n[i] == 1) {
                occurrenceOfOnes++;
            }
        }

        for (int i = 0; i < n.length; i++) {
            if (n[i] == occurrenceOfOnes) {
                stantonMeasure++;
            }
        }


        return stantonMeasure;
    }

    public static void main(String[] args) {
        int a[] = {3, 1, 1, 4, 2};
        System.out.println(stantonMeasure(a));
    }
}