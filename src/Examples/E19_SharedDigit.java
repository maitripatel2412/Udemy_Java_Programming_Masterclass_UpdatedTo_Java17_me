package Exercises;

public class E19_SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(20,20));
    }
    public static boolean hasSharedDigit(int a,int b){
        if (a >= 10 && a <= 99 && b >= 10 && b <= 99){
            int cacheNumber = a;
            while (cacheNumber > 0){

                int cacheNumber2 = b;
                while (cacheNumber2 > 0){
                    if(cacheNumber % 10 == cacheNumber2 % 10){
                        return true;
                    }
                    cacheNumber2 /= 10;
                }
                cacheNumber /= 10;
            }
        }
        return  false;
    }
}
