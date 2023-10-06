package Section_15;

import java.util.*;

public class Main_Hashing {
    public static void main(String[] args) {

        String aText = "Hello";
        String bText = "Hello";
        String cText = String.join("l","He","lo");
        String dText = "He".concat("llo");
        String eText = "hello";

        List<String> hellos = Arrays.asList(aText,bText,cText,dText,eText);
        hellos.forEach(s -> System.out.println(s + " : " + s.hashCode()));

        Set<String> mySet = new HashSet<>(hellos);

        System.out.println("mySet = " + mySet);
        System.out.println("# of elements " + mySet.size());

        for (String setValue : mySet){
            System.out.print(setValue + " : ");
            for (int i = 0 ; i < hellos.size() ; i++){
                if (setValue == hellos.get(i)){
                    System.out.print(i + ", ");
                }
            }
            System.out.println(" ");
        }

        PlayingCard aceOfHeart = new PlayingCard("Hearts","Ace");
        PlayingCard kingsClubs = new PlayingCard("Clubs","King");
        PlayingCard queenSpades = new PlayingCard("Spades","Queen");

        List<PlayingCard> cards = Arrays.asList(aceOfHeart,kingsClubs,queenSpades);
        cards.forEach(s -> System.out.println(s + " : " + s.hashCode()));
        Set<PlayingCard> deck = new HashSet<>();
        for (PlayingCard c : cards){
            if (!deck.add(c)){
                System.out.println("Found a duplicate for " + c);
            }
        }
        System.out.println(deck);
    }
}
