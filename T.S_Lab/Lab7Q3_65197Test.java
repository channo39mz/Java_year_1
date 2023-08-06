import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Lab7Q3_65197Test {
    public static void main(String[] args) {
        // numDaysFromDate(9, 1, 2004, 5);
        LocalDate novlyr21 = LocalDate.of(2004,2,29);
        LocalDate novlyr22 = LocalDate.of(2021,12,31);
        long daybtw;
        daybtw = ChronoUnit.DAYS.between(novlyr21 , novlyr22 );
        System.out.print(daybtw);
    }
    
}
