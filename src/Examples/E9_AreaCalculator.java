package Examples;

public class E9_AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(10.5));
        System.out.println(area(10.0,10.0));
    }
    public static double area(double radius){
        return (radius<0)?-1.0:radius*radius*Math.PI;
    }

    public static double area(double x,double y){
        return (x < 0 || y < 0)?-1.0:x*y;

    }
}
