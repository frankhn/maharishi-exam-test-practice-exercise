import java.util.Arrays;

/**
 * solve10
 */
public class Solve10 {
    public static String solve10() {
        int[] arr = new int[2];
        int factorial10 = 3628800;
        boolean factorialFound = false;
        int i = 0;
        int j = 0;
        
        for (i = 0; i <10; i++) {
            int factorial1 = 1;
            for (int j1 = 1; j1 <= i; j1++) {
                factorial1 *= j1;
            }
            for (j = 0; j < 10; j++) {
            int factorial2 = 1;
                for (int j2 = 1; j2 <= j; j2++) {      
                factorial2 *= j2;
                }
            if (factorial1 + factorial2 == factorial10) {
                factorialFound = true;
                break;
            }
            }
            if (factorialFound) {
                break;
            }
        }
        if(i == 10 && j == 10){
			//Not Found
			i = 0;
			j = 0;
		}
        arr[0] = i;  
        arr[1] = j;  
            return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        System.out.println(solve10());
    }
}