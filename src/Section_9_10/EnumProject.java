package Section_9_10;

import java.util.Random;

public class EnumProject {
    public static void main(String[] args) {

        Enum_DayOfTheWeek weekDay = Enum_DayOfTheWeek.SUNDAY;
        System.out.println(weekDay);

        for (int i = 0 ; i < 10 ; i++) {
            weekDay = getRandomDay();
//            System.out.printf("name is %s , ordinal value = %d%n", weekDay.name(), weekDay.ordinal());
//
//            if (weekDay == Enum_DayOfTheWeek.FRIDAY){
//                System.out.println("found a friday!!!!");
//            }

            switchDayOfWeek(weekDay);
        }

        for (Enum_Topping topping : Enum_Topping.values()){
            System.out.println(topping.name()+" : "+topping.getPrice());
        }

    }

    private static void switchDayOfWeek(Enum_DayOfTheWeek weekDay){
        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay){
            case WEDNESDAY -> System.out.println("wednesday is day "+weekDayInteger);
            case SUNDAY -> System.out.println("sunday is day "+weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) +
                    weekDay.name().substring(1).toLowerCase() +
                    " is Day "+weekDayInteger);
        }
    }
    private static Enum_DayOfTheWeek getRandomDay(){

        int randomInteger = new Random().nextInt(7);
        var allDays = Enum_DayOfTheWeek.values();

        return allDays[randomInteger];
    }
}
