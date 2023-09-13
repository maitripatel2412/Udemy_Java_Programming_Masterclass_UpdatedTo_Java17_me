package Examples;

public class E7_EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(5,5,10));
    }
    public static boolean hasEqualSum(int first, int second, int third) {
        if (first + second == third) {
            return true;
        }

        else {
            return false;
        }
    }
}
