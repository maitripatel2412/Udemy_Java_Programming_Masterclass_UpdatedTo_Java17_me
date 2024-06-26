package Section_18.DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Main_DateAndTime {
        public static void main(String[] args) {

            LocalDate today = LocalDate.now();
            System.out.println(today);

            LocalDate Five5 = LocalDate.of(2022, 5, 5);
            System.out.println(Five5);

            LocalDate May5th = LocalDate.of(2022, Month.MAY, 5);
            System.out.println(May5th);

            LocalDate Day125 = LocalDate.ofYearDay(2022, 125);
            System.out.println(Day125);

            LocalDate May5 = LocalDate.parse("2022-05-05");
            System.out.println(May5);

            System.out.println(May5.getYear());
            System.out.println(May5.getMonth());

            System.out.println(May5.getMonthValue());

            System.out.println(May5.getDayOfMonth());
            System.out.println(May5.getDayOfWeek());
            System.out.println(May5.getDayOfYear());

            System.out.println(May5.get(ChronoField.YEAR));
            System.out.println(May5.get(ChronoField.MONTH_OF_YEAR));
            System.out.println(May5.get(ChronoField.DAY_OF_MONTH));
            System.out.println(May5.get(ChronoField.DAY_OF_YEAR));

            System.out.println(May5.withYear(2000));
            System.out.println(May5.withMonth(3));
            System.out.println(May5.withDayOfMonth(4));
            System.out.println(May5.withDayOfYear(126));
            System.out.println(May5);
            System.out.println(May5.with(ChronoField.DAY_OF_YEAR, 126));
            System.out.println(May5.plusYears(1));
            System.out.println(May5.plusMonths(12));
            System.out.println(May5.plusDays(365));
            System.out.println(May5.plusWeeks(52));
            System.out.println(May5.plus(365, ChronoUnit.DAYS));

            System.out.println("May5 > today? " + May5.isAfter(today));
            System.out.println("today > May5? " + May5.isBefore(today));
            System.out.println("May5 > today? " + May5.compareTo(today));
            System.out.println("today > May5? " + today.compareTo(May5));

            System.out.println("today = now ? " + today.compareTo(LocalDate.now()));
            System.out.println("today = now ? " + today.equals(LocalDate.now()));

            System.out.println(today.isLeapYear());
            System.out.println(May5.minusYears(2).isLeapYear());

            System.out.println("----------------------------------------------------------------");
            May5.datesUntil(May5.plusDays(7)).forEach(System.out::println);

            System.out.println("----------------------------------------------------------------");
            May5.datesUntil(May5.plusYears(1) , Period.ofDays(7)).forEach(System.out::println);

            LocalTime time = LocalTime.now();
            System.out.println(time);

            LocalTime sevenAm = LocalTime.of(7,0);
            System.out.println(sevenAm);

            LocalTime seven30 = LocalTime.of(7,30,00);
            System.out.println(seven30);

            LocalTime sevenPm = LocalTime.parse("19:00");
            LocalTime sevenThirtyPm = LocalTime.parse("19:30:15.1000");
            System.out.println(sevenPm.get(ChronoField.AMPM_OF_DAY));
            System.out.println(sevenThirtyPm.get(ChronoField.AMPM_OF_DAY));

            System.out.println(sevenThirtyPm.getHour());
            System.out.println(sevenThirtyPm.get(ChronoField.HOUR_OF_DAY));

            System.out.println(sevenThirtyPm.plus(1,ChronoUnit.HOURS));

         }


}


