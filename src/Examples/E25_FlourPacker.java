package Examples;

public class E25_FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(2,1,10));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        if ((bigCount * 5) <= goal)
            return ((goal-(bigCount*5)) <= smallCount);

        else
            return ((goal % 5) <= smallCount);
    }
}
