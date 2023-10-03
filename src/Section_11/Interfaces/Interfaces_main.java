package Section_11.Interfaces;

import java.util.LinkedList;
import java.util.List;

public class Interfaces_main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Animals animal = bird;
        FlightEnable flier = bird;
        Trackable track = bird;

        animal.move();
        flier.takeOff();
        flier.fly();
        flier.land();
        track.track();

        inFlight(flier);
        inFlight(new Jet());

        Trackable truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnable.KM_TO_MILES;
        System.out.printf("the truck traveled %.2f km or %.2f miles %n",kmsTraveled,milesTraveled);

        LinkedList<FlightEnable> fliers = new LinkedList<>();
        fliers.add(bird);

        List<FlightEnable> betterFliers = new LinkedList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);

    }

    private static void inFlight(FlightEnable flier){
        flier.takeOff();
        flier.fly();

        if (flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFliers(List<FlightEnable> fliers){
        for (var flier : fliers){
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnable> fliers){
        for (var flier : fliers){
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnable> fliers){
        for (var flier : fliers){
            flier.land();
        }
    }
}
