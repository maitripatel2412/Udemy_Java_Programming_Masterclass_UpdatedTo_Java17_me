package Exercises;

public class E20_LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(isValid(98));
        System.out.println(hasSameLastDigit(987,896,789));
    }
    public static boolean isValid(int num){
        return (num > 9) && (num < 1001);
    }
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(isValid(a) && isValid(b) && isValid(c)){
            a %= 10;
            b %= 10;
            c %= 10;
            return (a == b) || (a == c) || (b == c);
        }
        return false;
    }
}
