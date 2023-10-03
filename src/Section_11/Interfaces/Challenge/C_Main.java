package Section_11.Interfaces.Challenge;

import java.util.ArrayList;
import java.util.List;

public class C_Main {
    public static void main(String[] args) {

        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("sydney town hall", UsageType.GOVERNMENT));
        mappables.add(new Building("sydney opera house",UsageType.ENTERTAINMENT));
        mappables.add(new Building("stadium",UsageType.SPORTS));

        mappables.add(new UtilityLine("college st",UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("olympic blvd",UtilityType.WATER));

        for (var m : mappables){
            Mappable.mapIt(m);
        }
    }
}
