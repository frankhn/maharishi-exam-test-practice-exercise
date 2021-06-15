import java.util.*;

public class Index {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();

        cars.add("hyundai sonata");
        cars.add("Toyota");

        System.out.println(cars);

        // Set demonstration using HashSet
        Set<String> hash_Set = new HashSet<String>();

        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");

        System.out.println(hash_Set);

        hash_Set.remove("For");

        System.out.println(hash_Set);

    }
}
