package Application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataHoraLocalGlobalParaLocal {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T16:20:30");
        Instant d06 = Instant.parse("2022-07-20T01:10:33Z");

        // Retorna uma coleção com os nomes dos fuso horários customizados
        // ZoneId.getAvailableZoneIds();

        // Converte o fuso horário global em Local
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        System.out.println(r1);
    }
}
