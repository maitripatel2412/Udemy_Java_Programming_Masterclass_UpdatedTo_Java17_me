package Section_9_10;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {
    public static void main(String[] args) {

//        LinkedList<String> placesToVisit = new LinkedList<>();

        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("goa");
        placesToVisit.add(0,"kedarnath");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

//        gettingElements(placesToVisit);

//        printItinerary(placesToVisit);
//        printItinerary2(placesToVisit);
//        printItinerary3(placesToVisit);

        testIterator(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("Dwarka");
        list.addLast("Manali");
        // queue methods
        list.offer("somnath");
        list.offerFirst("kashmir");
        list.offerLast("kulu");
        // stack method
        list.push("gujarat");
    }

    private static void removeElements(LinkedList<String> list){

        list.remove(4);
        list.remove("kulu");

        System.out.println(list);
        String s1 = list.remove(); // removes first element
        System.out.println(s1+" was removed \n");

        System.out.println(list);
        String s2 = list.removeFirst(); // removes first element
        System.out.println(s2+" was removed \n");

        System.out.println(list);
        String s3 = list.removeLast(); // removes last element
        System.out.println(s3+" was removed \n");

        // queue/deque poll methods
        System.out.println(list);
        String p1 = list.poll(); // removes first element
        System.out.println(p1+" was removed \n");

        System.out.println(list);
        String p2 = list.pollFirst(); // removes first element
        System.out.println(p2+" was removed \n");

        System.out.println(list);
        String p3 = list.pollLast(); // removes last element
        System.out.println(p3+" was removed \n");

        list.push("kedarnath");
        list.push("kashmir");
        list.push("rajasthan");
        System.out.println(list);

        String p4 = list.pop(); // removes first element
        System.out.println(p4+" was removed \n");
    }

    private static void gettingElements(LinkedList<String> list){

        System.out.println("retrieved element = "+list.get(4));
        System.out.println("first element = "+list.getFirst());
        System.out.println("last element = "+list.getLast());

        System.out.println("goa is at position : " +list.indexOf("goa"));
        System.out.println("kedarnath is at position : " +list.lastIndexOf("kedarnath"));

        //queue retrieval method

        System.out.println("element from element() = "+list.element());

        // stack retrieval method

        System.out.println("element from peek() " + list.peek());
        System.out.println("element from peekFirst() "+list.peekFirst());
        System.out.println("element from peekLast() "+list.peekLast());

    }

    private static void printItinerary(LinkedList<String> list){

        System.out.println("trip starts at " + list.getFirst());
        for (int i = 1; i < list.size();i++){
            System.out.println("--> from: "+list.get(i-1)+" to "+list.get(i));
        }
        System.out.println("trip ends at "+list.getLast());
    }

    private static void printItinerary2(LinkedList<String> list){

        System.out.println("trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list){
            System.out.println("--> from: "+previousTown+" to "+town);
            previousTown = town;
        }
        System.out.println("trip ends at "+list.getLast());
    }

    private static void printItinerary3(LinkedList<String> list){

        System.out.println("trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> from: "+previousTown+" to "+town);
            previousTown = town;
        }
        System.out.println("trip ends at "+list.getLast());
    }

    private static void testIterator(LinkedList<String> list){
        var iterator = list.listIterator();
        while (iterator.hasNext()){
//            System.out.println(iterator.next());
            if (iterator.next().equals("goa")){
                iterator.add("himachal ");
            }
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.next());
    }

}
