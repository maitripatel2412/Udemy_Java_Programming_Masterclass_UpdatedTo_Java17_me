package Section_9_10;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
    public static void main(String[] args) {
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

//        int returnedMin = findmin(returnedArray);
//        System.out.println("min value = "+returnedMin);

//        reverse(returnedArray);
//        System.out.println("final: "+Arrays.toString(returnedArray));

        int[] reversedCopy = reverseCopy(returnedArray);
        System.out.println("after reversed = "+Arrays.toString(returnedArray));
        System.out.println("reversed copy = "+Arrays.toString(reversedCopy));

    }

    private static int[] readIntegers(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a list of integers, separated by commas");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0 ; i < splits.length ; i++){
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findmin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i : array){
            if (i < min){
                min = i;
            }
        }
        return min;
    }

    public static void reverse(int[] array){

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("-----> "+Arrays.toString(array));
        }
    }

    private static int[] reverseCopy(int[] array){

        int[] reverseArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int el : array){
            reverseArray[maxIndex--] = el;
        }
        return reverseArray;
    }
}
