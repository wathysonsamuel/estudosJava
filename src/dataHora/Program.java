package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formatar data
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // formatar data

        LocalDate d01 = LocalDate.now();  // apenas data
        LocalDateTime d02 = LocalDateTime.now(); // data e horario
        Instant d03 = Instant.now(); // data e hora no GMT global com fuso horario de londres

        LocalDate d04 = LocalDate.parse("22-07-20"); // pega a String e transforma em objeto date
        LocalDateTime d05 = LocalDateTime.parse("22-07-20T01:30:26"); // pega a String e transforma em objeto dateTime
        Instant d06 = Instant.parse("22-07-20T01:30:26Z"); // data em horário de londres
        Instant d07 = Instant.parse("22-07-20T01:30:26-03:00"); // transforma data e hora do brasil em horario de londres

        LocalDate d08 = LocalDate.parse("20/07/22", fmt1);
        LocalDate d09 = LocalDate.parse("20/07/22 01:00", fmt2);

        LocalDate d10 = LocalDate.of(2022, 8, 25);
        LocalDateTime d11 = LocalDateTime.of(2022, 8, 25, 1, 30);

        System.out.println("D01" + d01);
        System.out.println("D02" + d02);
        System.out.println("D03" + d03);
        System.out.println("D04" + d04);
        System.out.println("D05" + d05);
        System.out.println("D06" + d06);
        System.out.println("D07" + d07);
        System.out.println("D08" + d08);
        System.out.println("D09" + d09);
        System.out.println("D10" + d10);
        System.out.println("D11" + d11);
    }
}
