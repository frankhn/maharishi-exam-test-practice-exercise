import java.util.Arrays;

/**
 * nFactorial
 */
public class nFactorial {

    public static void main(String[] args) {
        System.out.println(solveFactorial());
    }

    static String solveFactorial() {
        int result[] = { 0, 0 };
        int tenFactorial = 1;
        boolean factorialFound = false;

        int x =1;
        int y = 1;

        for (int i = 9; i > 0; i--) {
            tenFactorial = tenFactorial * i;
        }

        System.out.println(tenFactorial);

        int XFactorial = 1;

        for (x = 1; x <= 10; x++) {

            for (int b = 1; b <= x; b++) {
                XFactorial = XFactorial * b;
            }

            for (y = 1; y <= 10; y++) {

                int YFactorial = 1;

                for (int a = 1; a <= y; a++) {
                    YFactorial = YFactorial * a;
                }
                
                int answer = XFactorial + YFactorial;
                // System.out.println(XFactorial +"  here " + YFactorial + " there addition"+  answer);
                if (answer == tenFactorial) {
                    factorialFound = true;
                    break;
                }

            }
            if (factorialFound) {
                result[0] = x;
                result[1] = y;
                break;
            }
        }
        
        return Arrays.toString(result);
    }
}