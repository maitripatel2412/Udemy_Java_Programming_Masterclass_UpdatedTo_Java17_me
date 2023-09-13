package Examples;

public class E34_Calculator {

    private E34_Floor floor;
    private E34_Carpet carpet;

    public E34_Calculator(E34_Floor floor, E34_Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return (floor.getArea() * carpet.getCost());
    }
}
