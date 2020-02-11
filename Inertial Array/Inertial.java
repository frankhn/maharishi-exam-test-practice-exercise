// 3. An array is defined to be inertial if the following conditions hold:
// a. it contains at least one odd value
// b. the maximum value in the array is even
// c. every odd value is greater than every even value that is not the maximum value.
// So {11, 4, 20, 9, 2, 8} is inertial because
// a. it contains at least one odd value
// b. the maximum value in the array is 20 which is even
// c. the two odd values (11 and 9) are greater than all the
//  even values that are not equal to 20 (the maximum), i.e., (4, 2, 8}.
// However, {12, 11, 4, 9, 2, 3, 10} is not inertial because it fails condition (c), i.e., 10 (which is
// even) is greater 9 (which is odd) but 10 is not the maximum value in the array.
// Write a function called isIntertial that accepts an integer array and returns 1 if the array is
// inertial; otherwise it returns 0. 
public class Inertial {

    public static int isInertial(int[] a) {

        int max = 0;
        Boolean hasOdd = false;
        int i =0;
        boolean maxIsEven = true;
        int isInertial = 1;

        for (int j = 0; j < a.length; j++) {
            if (a[j] >= max) {
                max = a[j];
            }

        }
        if (max % 2 != 0) {
            maxIsEven = false;
        }

        while(i < a.length) {
            if (a[i] % 2 !=  0) {
                hasOdd = true;
                break;
            }
            i++;
        }

         if (hasOdd && maxIsEven) {
             for (int j = 0; j < a.length; j++) {
                if (a[j] % 2 != 0 ) {
                    if (a[j] < max) {    
                        for (int j2 = 0; j2 < a.length; j2++) {
                            if (a[j2] % 2 == 0 && a[j2] != max) {
                                if (a[j2] > a[j]) {
                                    isInertial = 0;
                                }
                            }
                        } 
                    } else {
                        isInertial = 0;
                    }
                }
            }
         } else {
             isInertial = 0;
         }

        return isInertial;
    }

    public static void main(String[] args) {
        int [] a = {1, 5, 8};
        System.out.println(isInertial(a));
    }
}