package dataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Calculos {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeek = d01.minusDays(8);
        LocalDate nextWeek = d01.plusDays(8);

        System.out.println("PastWeekDateTime: " + pastWeek);
        System.out.println("NextWeekDateTime: " + nextWeek);

        LocalDateTime pastWeek1 = d02.minusDays(8);
        LocalDateTime nextWeek1 = d02.plusDays(8);

        System.out.println("PastWeekDateTime: " + pastWeek1);
        System.out.println("NextWeekDateTime: " + nextWeek1);

        Instant pastWeek2 = d03.minusNanos(565);
        Instant nextWeek2 = d03.plusNanos(565);


        System.out.println("PastWeekInstant: " + pastWeek2);
        System.out.println("NextWeekInstant: " + nextWeek2);

        Duration t1 = Duration.between(pastWeek, nextWeek);
        System.out.println("t1 days: " + t1.toDays());

    }
}
