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
        LocalDateTime r1 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("r1 = " + r1);

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 dia do ano = " + d04.getDayOfYear());
        System.out.println("d04 dia da semana = " + d04.getDayOfWeek());

        System.out.println("r1 horas = " + r1.getHour());
        System.out.println("r1 minutos = " + r1.getMinute());
        System.out.println("r1 segundos = " + r1.getSecond());

    }
}
