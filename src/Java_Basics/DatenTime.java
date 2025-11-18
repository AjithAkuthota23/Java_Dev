package Java_Basics;

import javax.swing.text.DateFormatter;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DatenTime {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println("Current date: "+ld);
        LocalDate specific= LocalDate.of(1999,10,23);
        System.out.println("Specific date: "+specific);

        LocalTime lt = LocalTime.now();
        System.out.println("Current time: "+lt);
        LocalTime specific_time= LocalTime.of(1,1,1);
        System.out.println("Specific time: "+specific_time);

        LocalDateTime ldt= LocalDateTime.now();
        System.out.println("Current date and time: "+ldt);
        LocalDateTime specific_datetime= LocalDateTime.of(1999,10,23,1,1);
        System.out.println("Specific datetime: "+specific_datetime);

        ZonedDateTime  zdt= ZonedDateTime.now();
        System.out.println("Current date and time: "+zdt);

        ZonedDateTime ind=ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println("Zoned date and time: "+ind);

        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Formatted date and time: "+ formatter.format(ind));
    }
}
