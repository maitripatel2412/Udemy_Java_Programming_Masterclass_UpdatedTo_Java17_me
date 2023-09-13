package Section_1_To_6;

public class Overloading2 {

    public static void main(String[] args) {

        System.out.println(" 5ft , 8in =" +converttocm(5,8)+" cm");
        System.out.println(" 68in = "+converttocm(68)+" cm");

    }

    public static double converttocm(int inches){
        return inches*2.54;
    }

    public static double converttocm(int feet,int inches){

        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = converttocm(totalInches);
        return result;

    }



}
