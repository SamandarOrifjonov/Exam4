import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);

        System.out.print("YYYY-MM-dd: ");
        String inputDate = scanner.nextLine();

        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        System.out.println(date + " day " + dayOfWeek + " of week");
    }
}
