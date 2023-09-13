package Examples;

public class E34_Floor {

    public static void main(String[] args) {
        E34_Carpet carpet = new E34_Carpet(3.5);
        E34_Floor floor = new E34_Floor(2.75, 4.0);
        E34_Calculator calculator = new E34_Calculator(floor,carpet);
        System.out.println("total= " + calculator.getTotalCost());

        carpet = new E34_Carpet(1.5);
        floor = new E34_Floor(5.4, 4.5);
        calculator = new E34_Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }

    private double width;
    private double length;

    public E34_Floor(double width,double length){
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    public double getArea(){
        return width*length;
    }
}
