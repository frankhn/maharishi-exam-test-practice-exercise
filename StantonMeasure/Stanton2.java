/**
 * Stanton2
 */
public class Stanton2 {


    public static void main(String[] args) {
        int a[] = {3,1,1,4};
        System.out.println(stanton(a));
    }

    static int stanton(int a[]) {
        int counter = 0;
        int stanton = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 1) counter++;
        }
        for (int j = 0; j < a.length; j++) {
           if (a[j] == counter) stanton++; 
        }
        return stanton;
    }
}