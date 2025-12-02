package Application;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
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
    }
}
