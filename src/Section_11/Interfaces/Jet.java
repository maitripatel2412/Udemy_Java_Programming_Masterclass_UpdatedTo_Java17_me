package Section_11.Interfaces;

public class Jet implements FlightEnable,Trackable {

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName()+" is taking off!");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName()+" is landing!");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+" is flying!");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+"'s coordinated recorded!");
    }

    @Override
    public FlightStages transition(FlightStages stages) {
        System.out.println(getClass().getSimpleName()+" transitioning");
        return FlightEnable.super.transition(stages);
    }
}
