package Section_9_10;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name,int distance){

    @Override
    public String toString() {
        return String.format("%s (%d)",name,distance);
    }
}
public class LinkedListChallenge {

    public static void main(String[] args) {

        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place goa = new Place("goa",900);
        addPlace(placesToVisit,goa);
        addPlace(placesToVisit,new Place("manali",950));
        addPlace(placesToVisit,new Place("up",1050));
        addPlace(placesToVisit,new Place("mp",1950));
        addPlace(placesToVisit,new Place("kerala",2950));

        placesToVisit.addFirst(new Place("gujarat",0));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop){
            if (!iterator.hasPrevious()){
                System.out.println("Originating : "+iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()){
                System.out.println("Final : "+iterator.previous());
                forward = false;
            }
            System.out.println("enter value : ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0,1);

            switch (menuItem){
                case "F":
                    System.out.println("User wants to go forward");
                    if (!forward){   // reversing direction
                        forward = true;
                        if ( iterator.hasNext()){
                            iterator.next();  // adjust position forward
                        }
                    }
                    if (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("user wants to go backward");
                    if (forward){   // reversing direction
                        forward = false;
                        if ( iterator.hasPrevious()){
                            iterator.previous();  // adjust position backward
                        }
                    }
                    if (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "L":
                    System.out.println(placesToVisit);
                    break;
                case "M":
                    printMenu();
                    break;

                default:
                    quitLoop = true;
                    break;
            }
        }
    }

    public static void addPlace(LinkedList<Place> list,Place place){
        if (list.contains(place)){
            System.out.println("found duplicate : "+place);
            return;
        }
        for (Place p : list){
            if (p.name().equalsIgnoreCase(place.name())){
                System.out.println("found duplicate : "+place);
                return;
            }
        }

        var matchedIndex = 0;
        for (var listPlace : list){
            if (place.distance() < listPlace.distance()){
                list.add(matchedIndex,place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }

    private static void printMenu(){
        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }
}
