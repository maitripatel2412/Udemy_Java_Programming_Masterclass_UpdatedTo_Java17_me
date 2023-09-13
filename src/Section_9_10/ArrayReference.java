package Section_9_10;

import java.util.Arrays;

public class ArrayReference {

    public static void main(String[] args) {

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        modifyArray(myIntArray);

        System.out.println("myIntArray :- "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray :- "+Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("after change myIntArray :- "+ Arrays.toString(myIntArray));
        System.out.println("after change anotherArray :- "+Arrays.toString(anotherArray));

    }

    public static void modifyArray(int[] array){

        array[1] = 2;
    }
}
