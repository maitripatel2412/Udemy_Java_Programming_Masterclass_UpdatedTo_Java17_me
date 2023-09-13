package Examples;

public class E8_TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(14,15,20));
//        System.out.println(isTeen(14));
    }
    public static boolean hasTeen(int nr1, int nr2, int nr3){
        return isTeen(nr1) || isTeen(nr2) || isTeen(nr3);
    }
    public static boolean isTeen(int nr1){
        return (nr1 >= 13 && nr1 <= 19);
    }
}
