package Section_11.Abstract;

import java.util.ArrayList;

public class Abstract_Main {
    public static void main(String[] args) {

//        Animal animal = new Animal("animal","big","100");

        Dog dog = new Dog("dog","big",50);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("german shepard","big",150));
        animals.add(new Fish("goldfish","small",1));
        animals.add(new Fish("barracuda","big",75));
        animals.add(new Dog("pug","small",20));

        animals.add(new Horse("clydesdale","large",1000));

        for (Animal animal : animals){
            doAnimalStuff(animal);
            if (animal instanceof Mammal currentMammal){
                currentMammal.shedHair();
            }
        }
    }

    private static void doAnimalStuff(Animal animal){

        animal.makeNoise();
        animal.move("slow");

    }
}
