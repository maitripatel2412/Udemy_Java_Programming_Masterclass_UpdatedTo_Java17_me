package Section_11.Interfaces;

public class Truck implements Trackable{

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+"'s coordinated recorded!");
    }

}
