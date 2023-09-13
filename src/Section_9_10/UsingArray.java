package Section_9_10;

import java.util.Arrays;
import java.util.Random;

public class UsingArray {

    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray,5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));
        Arrays.sort(thirdArray);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray,thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray,5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray,15);
        System.out.println(Arrays.toString(largerArray));

        String[] sArrays = {"maitri","payal","aastha","henvi","hetvi"};
        Arrays.sort(sArrays);
        System.out.println(Arrays.toString(sArrays));

        if (Arrays.binarySearch(sArrays,"payal") >=  0){
            System.out.println("payal found in the list");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};

        if (Arrays.equals(s1,s2)){
            System.out.println("arrays are equals");
        }else {
            System.out.println("arrays are not equals");
        }
    }

    private static int[] getRandomArray(int len){

        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len ; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
