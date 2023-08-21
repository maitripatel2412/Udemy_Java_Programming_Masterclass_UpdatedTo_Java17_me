package Exercises;

public class E12_PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,48));
    }
    public static boolean isCatPlaying(boolean summer,int temperature){
        if (summer && temperature >=25 && temperature <=45) return true;
        return !summer && temperature >= 25 && temperature <= 35;
    }
}
