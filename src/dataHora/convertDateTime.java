package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class convertDateTime {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault()); // converte o horário para gmt do pc
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal")); // converte para gmt portugal
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println("Dia: " + d01.getDayOfMonth()); // pegando dia mes e ano separadamente
        System.out.println("Mês: " + d01.getMonth());
        System.out.println("Ano: " + d01.getYear());

    }
}
