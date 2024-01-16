package Section_16.constructorsProject;


import Section_16.constructorsProject.external.Child;

public class Main__4 {

    public static void main(String[] args) {

        Parent parent = new Parent("Jane doe","01-01-1950",2);
        Child child = new Child();

        System.out.println("Parent : " + parent);
        System.out.println("Child : " + child);

        Persons joe = new Persons("Joe","01-01-1950");
        System.out.println(joe);

        Persons joeCopy = new Persons(joe);
        System.out.println(joeCopy);

        Generation g = Generation.BABY_BOOMER;

    }
}
