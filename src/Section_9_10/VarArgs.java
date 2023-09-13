package Section_9_10;

public class VarArgs {

    public static void main(String... args) {

        System.out.println("hello world again!");
        String[] splitString = "hello world again".split(" ");
        printText(splitString);

        System.out.println("_".repeat(20));
        printText("hello","world");
    }

    private static void printText(String... textList){

        for (String t : textList){
            System.out.println(t);
        }
    }
}
