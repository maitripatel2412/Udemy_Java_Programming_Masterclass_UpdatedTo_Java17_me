package Section_7;

public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(){
        super("mutt","big",50);
    }

    public Dog(String type , double weight){
        this(type,weight,"perky","curled");
    }
    public Dog(String type,double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? " small " : (weight < 35 ? " medium " : " large "), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("dogs walk,run and wag their tail");
        if (speed == "slow"){
            walk();
            wagTail();
        }else {
            run();
            bark();
        }
        System.out.println();
    }

    @Override
    public void makeNoise() {
        if (type == "wolf"){
            System.out.println("ow woooooooo! ");
        }
        bark();
        System.out.println();
        super.makeNoise();
    }

    private void bark(){
        System.out.println("woof! ");
    }
    private void run(){
        System.out.println("dog running! ");
    }
    private void walk(){
        System.out.println("dog walking! ");
    }
    private void wagTail(){
        System.out.println("tail wagging ");
    }
}
