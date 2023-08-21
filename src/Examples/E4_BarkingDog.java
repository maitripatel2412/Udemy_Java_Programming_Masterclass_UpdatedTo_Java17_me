package Exercises;

public class E4_BarkingDog {

    public static void main(String[] args) {

        shouldWakeUp(true,7);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            System.out.println("Invalid Hours");
            return false;
        } else if (barking && hourOfDay >= 0 && hourOfDay < 8) {
            System.out.println("true");
            return true;
        } else if (barking && hourOfDay > 22 && hourOfDay <= 23) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
