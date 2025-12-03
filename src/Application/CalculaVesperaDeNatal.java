package Application;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CalculaVesperaDeNatal {
    public static void main(String[] args) {
        String value = "2025-12-24";
        LocalDate vesperaNatal = LocalDate.parse(value);
        LocalDate dataAtual = LocalDate.now(ZoneId.systemDefault());
        Duration diasParaNatal = Duration.between(dataAtual.atTime(0, 0), vesperaNatal.atTime(0,0));

        long diasFaltando = ChronoUnit.DAYS.between(dataAtual,vesperaNatal);
        System.out.println("Solução com ChronoUnit = " + diasFaltando);
        System.out.println("o Natal é em = " + diasParaNatal.toDays() + " dias");

        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println(dataAtual.format(dataFormatada));

        LocalTime localTime = LocalTime.now(ZoneId.systemDefault());
        System.out.println(localTime.format(horaFormatada));
    }
}
