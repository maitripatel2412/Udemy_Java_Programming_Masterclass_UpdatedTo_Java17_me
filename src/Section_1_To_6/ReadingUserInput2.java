package Section_1_To_6;

import java.util.Scanner;

public class ReadingUserInput2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        double sum = 0;

        do {
            System.out.println("enter a number #"+counter+":");
            String nextNumber = scanner.nextLine();
            try{
//                int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            }catch (NumberFormatException e){
                System.out.println("Invalid Value");
            }
        }while (counter <= 5);
        System.out.println("sum of 5 numbers are : "+sum);
    }
}
