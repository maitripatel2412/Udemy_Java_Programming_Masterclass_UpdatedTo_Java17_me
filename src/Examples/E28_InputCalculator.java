package Exercises;

import java.util.Scanner;

public class E28_InputCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double counter = 0;
        int sum = 0;
        long avg = 0;

        while(true) {
            System.out.println("enter values :- ");
            boolean isAnInt = scanner.hasNextInt();
            counter++;
            if(isAnInt) {
                int number = scanner.nextInt();
                sum = sum + number;
                avg = (long) Math.round(sum / counter);
            }
            else if(counter == 0){
                System.out.println("SUM = 0 AVG = 0");
            }
            else {
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }
    }
}
