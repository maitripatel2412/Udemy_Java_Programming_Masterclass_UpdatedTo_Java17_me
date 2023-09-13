package Examples;

public class E34_Carpet {

    private double cost;

    public E34_Carpet(double cost){
        this.cost = cost < 0 ? 0 : cost;
    }

    public double getCost(){
        return cost;
    }
}
