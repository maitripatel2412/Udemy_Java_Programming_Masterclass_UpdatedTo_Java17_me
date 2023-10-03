package Section_11.Interfaces;

enum FlightStages implements Trackable{

    GROUNDED,LAUNCH,CRUISE,DATA_COLLECTION;
    @Override
    public void track() {
        if (this != GROUNDED){
            System.out.println("monitoring "+this);
        }
    }

    public FlightStages getNextStage(){
        FlightStages[] allStages = values();
        return allStages[(ordinal()+1)%allStages.length];
    }
}
record DragonFly(String name,String type) implements FlightEnable{
    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
class Satellite implements OrbitEarth{

    FlightStages stage = FlightStages.GROUNDED;
    public void achieveOrbit(){
        transition("orbit achieved");
    };

    @Override
    public void takeOff() {
        transition("taking off");
    }

    @Override
    public void land() {
        transition("landing");
    }

    @Override
    public void fly() {
        achieveOrbit();
        transition("data collection while orbiting");
    }

    public void transition(String description){
        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }
}
interface OrbitEarth extends FlightEnable{

    void achieveOrbit();
    private static void log(String description){
        var today = new java.util.Date();
        System.out.println(today+" : "+description);
    }

    private void logStage(FlightStages stages,String description){
        description = stages + " : " + description;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stages) {
        FlightStages nextStage =  FlightEnable.super.transition(stages);
        logStage(stages,"beginning transition to "+nextStage);
        return nextStage;
    }
}
interface FlightEnable{

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void takeOff();
    void land();
    void fly();

    default FlightStages transition (FlightStages stages){
//        System.out.println("transition not implemented on "+getClass().getName());
//        return null;
        FlightStages nextStage = stages.getNextStage();
        System.out.println("transitioning from "+stages+" to "+nextStage);
        return nextStage;
    }
}

interface Trackable{

    void track();
}
public abstract class Animals {

    public abstract void move();

}
