import java.util.*;

public class IteratorIndex {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Hyundai");
        cars.add("Toyota");

        Iterator<String> iCars = cars.iterator();

        // Print first item
        System.out.println(iCars.next());
      

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i < 10) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}
