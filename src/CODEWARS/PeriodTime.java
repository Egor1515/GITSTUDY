package CODEWARS;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.*;


public class PeriodTime {

    public static void main(String[] args) {
        LocalDate last = LocalDate.of(2023, 6, 15);
        LocalDate first = LocalDate.of(2023, 8, 15);
        System.out.println(periodIsLate(last, first, 25));
    }

    public static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
        return DAYS.between(last, today) > cycleLength;
    }
}