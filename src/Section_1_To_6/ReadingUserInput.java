package Section_1_To_6;

import java.util.Scanner;

public class ReadingUserInput {

    public static void main(String[] args) {

        int currentyear = 2023;

        try {
            System.out.println(getInputFromConsole(currentyear));
        }catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentyear));
        }
//        String usersdob = "2001";
//
//        int dateofbirth = Integer.parseInt(usersdob);
//
//        System.out.println("Age = "+(currentyear - dateofbirth));
//
//        String usersAgeWithPartialYear = "22.5";
//        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
//        System.out.println("the user says that he is "+ageWithPartialYear);
    }
    public static String getInputFromConsole(int currentyear){

        String name = System.console().readLine("hi what's your name? ");
        System.out.println("hi "+name+" thanks for taking the course.");

        String dateOfBirth = System.console().readLine("what year were you born ? ");

        int age = currentyear - Integer.parseInt(dateOfBirth);
        return "so, you are "+age+" years old.";
    }

    public static String getInputFromScanner(int currentyear){

        Scanner scanner = new Scanner(System.in);

        System.out.println("hi, what's your name?");
        String name = scanner.nextLine();
//        String name = System.console().readLine("hi what's your name? ");
        System.out.println("hi "+name+" thanks for taking the course.");

//        String dateOfBirth = System.console().readLine("what year were you born ? ");
        System.out.println("what year were you born ? ");

        boolean validDob = false;
        int age = 0;

        do {
            System.out.println("enter a year of birth >= "+(currentyear-125)+" and <= "+(currentyear));
            try {
                age = checkData(currentyear, scanner.nextLine());
                validDob = age < 0 ? false : true;
            }catch (NumberFormatException badUserException){
                System.out.println("characters not allowed!! try again ");
            }
        }while (!validDob);

        return "so, you are "+age+" years old.";
    }
    public static int checkData(int currentyear,String dateofbirth){
        int dob = Integer.parseInt(dateofbirth);
        int minimumyear = currentyear - 125;

        if ((dob < minimumyear) || (dob > currentyear)){
            return -1;
        }
        return (currentyear-dob);
    }
}
