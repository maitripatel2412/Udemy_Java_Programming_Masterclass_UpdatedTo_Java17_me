package Section_9_10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayAndArrayLists {

    public static void main(String[] args) {

        String[] originalArray = new String[]{"First","Second","Third","Aaa"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0,"One");
        System.out.println("list : "+originalList);
        System.out.println("array : "+Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array : "+Arrays.toString(originalArray));

//        originalList.add("fourth");

        List<String> newList = Arrays.asList("sunday","monday","tuesday");
        System.out.println(newList);
    }
}
