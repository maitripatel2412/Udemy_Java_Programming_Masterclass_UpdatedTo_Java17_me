package Exercises;

public class E13_NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(9);
    }
    public static void printNumberInWord(int number){
        String word = "OTHER";

        if (number == 0){
            word = "ZERO";
        } else if (number == 1) {
            word = "ONE";
        }else if (number == 2) {
            word = "TWO";
        }else if (number == 3) {
            word = "THREE";
        }else if (number == 4) {
            word = "FOUR";
        }else if (number == 5) {
            word = "FIVE";
        }else if (number == 6) {
            word = "SIX";
        }else if (number == 7){
            word = "SEVEN";
        } else if (number == 8){
            word = "EIGHT";
        }else if (number == 9){
            word = "NINE";
        }
        System.out.println(word);
    }
}
