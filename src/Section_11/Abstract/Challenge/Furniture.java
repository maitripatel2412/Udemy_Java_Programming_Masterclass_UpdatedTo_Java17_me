package Section_11.Abstract.Challenge;

public class Furniture extends ProductForSale{


    public Furniture(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(" this "+type+" was manufactured in india ");
        System.out.printf("the price of the piece is $%6.2f %n",price);
        System.out.println(description);
    }
}
