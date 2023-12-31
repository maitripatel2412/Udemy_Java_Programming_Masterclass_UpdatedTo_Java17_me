package Section_1_To_6;

public class PrimeNumber {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 10 ; count < 3 && i <= 50 ; i++){
            if (isPrime(i)){
                System.out.println("number "+i+" is a prime  number");
                count++;
                if (count==3){
                    System.out.println("found 3-exitig for loop");
                    break;
                }
            }
        }

        System.out.println("total number of prime numbers between 10 and 50 is "+count);

//        System.out.println("0 is "+(isPrime(0)?"":"NOT")+" a prime number");

    }

    public static boolean isPrime(int wholeNumber){

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2 ; divisor < wholeNumber ; divisor++){
            if (wholeNumber%divisor==0){
                return false;
            }
        }
        return true;
    }
}
