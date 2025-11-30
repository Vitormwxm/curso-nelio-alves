package Application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args) {

        LocalDate date01 = LocalDate.now();

        System.out.println(date01);

        LocalDateTime date02 = LocalDateTime.now();
        System.out.println(date02);

        Instant date03 = Instant.now();
        System.out.println(date03);

        LocalDate date04 = LocalDate.parse("2025-11-30");
        System.out.println(date04);

        LocalDateTime date05 = LocalDateTime.parse("2025-11-30T11:54:55");
        System.out.println(date05);

        Instant date06 = Instant.parse("2025-11-30T11:54:55Z");
        System.out.println(date06);

        Instant date07 = Instant.parse("2025-11-30T11:54:55-03:00");
        System.out.println(date07);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateFormatter = LocalDate.parse("27/10/2002", formatter);
        System.out.println(dateFormatter);

        LocalDate d10 = LocalDate.of(2022, 7 , 20);
        System.out.println(d10);

        DateTimeFormatter dateTimeFormatterInstant = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());
        System.out.println("Date Instant " + dateTimeFormatterInstant.format(date07));
    }
}
