package Exercises;

public class E2_SpeedConverter {

    public static void main(String[] args) {

//        toMilesPerHour(2);
        printConversion(9);
    }

    public static long toMilesPerHour(double kilometersPerHour){

        return kilometersPerHour < 0 ? -1 : Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour)  {
        System.out.println(
                kilometersPerHour < 0 ?
                        "Invalid Value" :
                        kilometersPerHour +
                                " km/h = " +
                                toMilesPerHour(kilometersPerHour) +
                                " mi/h");
    }
}
