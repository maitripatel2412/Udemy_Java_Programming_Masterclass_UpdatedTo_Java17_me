package Section_15;

import java.util.*;

public class EnumCollections {

    enum WeekDay { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
    public static void main(String[] args) {

        List<WeekDay> annsWorkDays = new ArrayList<>(List.of(WeekDay.MONDAY, WeekDay.TUESDAY,
                WeekDay.THURSDAY, WeekDay.FRIDAY));

        var annsDaySet = EnumSet.copyOf(annsWorkDays);
        System.out.println(annsDaySet.getClass().getSimpleName());
        annsDaySet.forEach(System.out::println);

        var allDaySet = EnumSet.allOf(WeekDay.class);
        System.out.println("--------------------------------------------------------------------");
        allDaySet.forEach(System.out::println);

        Set<WeekDay> newPersonDays = EnumSet.complementOf(annsDaySet);
        System.out.println("--------------------------------------------------------------------");
        newPersonDays.forEach(System.out::println);

        Set<WeekDay> anotherWay = EnumSet.copyOf(allDaySet);
        anotherWay.removeAll(annsDaySet);
        System.out.println("--------------------------------------------------------------------");
        anotherWay.forEach(System.out::println);

        Set<WeekDay> businessDays = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);
        System.out.println("--------------------------------------------------------------------");
        businessDays.forEach(System.out::println);

        Map<WeekDay, String[]> employeeMap = new EnumMap<>(WeekDay.class);

        employeeMap.put(WeekDay.FRIDAY,new String[] {"Ann,Mary,Bob"});
        employeeMap.put(WeekDay.MONDAY,new String[] {"Mary,Bob"});
        employeeMap.forEach((k,v) -> System.out.println(k + " : " + Arrays.toString(v)));

    }
}
