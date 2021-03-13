public class Exceptions {
    public static void main(String[] args) {
        checkAge(15);
        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]);
            
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}

// exception Types
// ArithmeticException, 
// FileNotFoundException, 
// ArrayIndexOutOfBoundsException, 
// SecurityException