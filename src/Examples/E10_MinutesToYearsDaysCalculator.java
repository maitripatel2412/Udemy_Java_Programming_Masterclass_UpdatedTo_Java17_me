package Examples;

public class E10_MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(9400234);
    }
    public static void printYearsAndDays(long minutes){

        if(minutes<0){
            System.out.println("Invalid Value");
        }else{

            long hour = minutes / 60;
            long day = hour / 24;
            long year = day / 365;
            long remainDays = day % 365;

            System.out.println(minutes + " min = " + year + " y and " + remainDays + " d");
        }
    }
}
