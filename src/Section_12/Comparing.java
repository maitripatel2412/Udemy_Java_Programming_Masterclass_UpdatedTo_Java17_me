package Section_12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Comparing {
    public static void main(String[] args) {

        Integer five = 5;
        Integer[] others = {0,5,10,-50,50};

        for (Integer i : others){
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo = %d%n",
                    five,(val == 0 ? "==" : (val < 0) ? "<" : ">"),i,val);
        }

        String banana = "Banana";
        String[] fruit = {"apple","Banana","pear","BANANA"};

        for (String s : fruit){
            int val = banana.compareTo(s);
            System.out.printf("%s %s %s: compareTo = %d%n",
                    banana,(val == 0 ? "==" : (val < 0) ? "<" : ">"),s,val);
        }
        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));

        System.out.println("A:" + (int) 'A' + " " + "a:" + (int)'a');
        System.out.println("B:" + (int) 'B' + " " + "b:" + (int)'b');
        System.out.println("P:" + (int) 'P' + " " + "p:" + (int)'p');

        student tim = new student("tim");
        student[] students = {new student("zack"),new student("tim"),new student("ann")};

        Arrays.sort(students);
        System.out.printf(Arrays.toString(students));

        System.out.println("result : "+tim.compareTo(new student("TIM")));

        Comparator<student> gpaSorter = new studentGPAComparator();
        Arrays.sort(students,gpaSorter.reversed());
        System.out.println(Arrays.toString(students));

    }
}

class studentGPAComparator implements Comparator<student>{

    @Override
    public int compare(student o1,student o2){
        return (o1.gpa+o1.name).compareTo(o2.gpa+o2.name);
    }
}

class student implements Comparable<student> {

    private static int LAST_ID = 1000;
    private static Random random = new Random();
    String name;
    private int id;
    protected double gpa;


    public student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0,4.0);
    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id,name,gpa);
    }

//    @Override
//    public int compareTo(Object o) {
//        student others = (student) o;
//        return name.compareTo(others.name);
//    }

    @Override
    public int compareTo(student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }
}
