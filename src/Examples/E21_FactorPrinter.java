package Exercises;

public class E21_FactorPrinter {
    public static void main(String[] args) {
        printFactors(9);
    }
    public static void printFactors(int number){
        if (number<1){
            System.out.print("Invalid Value");
            return;
        }

        for (int i = 1; i<=number/2; i++){
            if(number%i==0){
                System.out.print(i + " ");
            }
        }
        System.out.print(number);

    }
}
