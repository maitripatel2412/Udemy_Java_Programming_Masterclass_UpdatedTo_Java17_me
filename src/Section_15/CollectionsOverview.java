package Section_15;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class CollectionsOverview {
    public static void main(String[] args) {

        Collection<String> list = new HashSet<>();

        String[] names = {"Anna","Bob","Carol","David","Edna"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);

        list.add("Fred");
        list.addAll(Arrays.asList("George","Gary","Grace"));
        System.out.println(list);
        System.out.println("Gray is in the list? "+ list.contains("Gray"));

        list.removeIf(s -> s.charAt(0) == 'G');
        System.out.println(list);
        System.out.println("Gray is in the list? "+ list.contains("Gray"));
    }
}
