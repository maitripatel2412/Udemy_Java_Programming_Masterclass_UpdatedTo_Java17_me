package Section_11.Abstract;

import Section_11.Abstract.Mammal;

public class Horse extends Mammal {
    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType()+" sheds in the spring");
    }

    @Override
    public void makeNoise() {

    }
}
