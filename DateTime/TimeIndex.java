import java.time.LocalDate;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class TimeIndex {
    public static void main(String[] args) {
       LocalDateTime mydate = LocalDateTime.now();
       DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

       DateTimeFormatter anotherFor = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
       String thisFormatter = mydate.format(anotherFor);
       System.out.println(thisFormatter);

       String formattedDate = mydate.format(formatDate);
       System.out.println(formattedDate);

       LocalDate my = LocalDate.of(1994, 06, 5);
       System.out.println(my);
    }
}
