package Section_15;

import java.util.*;

public class Main_CollectionsMethods {
    public static void main(String[] args) {

        Card[] cardArray = new Card[13];
        Card aceOfHeart = Card.getFaceCard(Card.Suit.HEART,'A');
        Arrays.fill(cardArray,aceOfHeart);
        Card.printDeck(Arrays.asList(cardArray),"Aces Of Heart",1);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards,aceOfHeart);
        System.out.println(cards);
        System.out.println("Cards.Size() = "+cards.size());

        List<Card> acesOfHeart = Collections.nCopies(13,aceOfHeart);
        Card.printDeck(acesOfHeart,"Aces Of Heart",1);

        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUB,'K');
        List<Card> kingOfClubs1 = Collections.nCopies(13,kingOfClubs);
        Card.printDeck(kingOfClubs1,"King Of Clubs",1);

        Collections.addAll(cards,cardArray);
        Collections.addAll(cards,cardArray);
        Card.printDeck(cards,"Cards Collection With Aces Added",2);

        Collections.copy(cards,kingOfClubs1);
        Card.printDeck(cards,"Cards Collection With Kings Copied",2);

        cards = List.copyOf(kingOfClubs1);
        Card.printDeck(cards,"List Copy Of Kings",1);

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Collections.shuffle(deck);
        Card.printDeck(deck,"Shuffled Deck",4);

        Collections.reverse(deck);
        Card.printDeck(deck,"Reversed Deck Of Cards",4);

        var sortingAlgorithm = Comparator.comparing(Card::rank)
                .thenComparing(Card::suit);
        Collections.sort(deck,sortingAlgorithm);
        Card.printDeck(deck,"Standard Deck Sorted By Rank, Suit",13);

        Collections.reverse(deck);
        Card.printDeck(deck,"Sorted By Rank,Suit Reversed: ",13);

        List<Card> kings = new ArrayList<>(deck.subList(4,8));
        Card.printDeck(kings,"Kings in Deck",1);

        List<Card> tens = new ArrayList<>(deck.subList(16,20));
        Card.printDeck(tens,"Tens in Deck",1);

        int subListIndex = Collections.indexOfSubList(deck,tens);
        System.out.println("Sublist Index For Tens = " + subListIndex);
        System.out.println("Contains = " + deck.containsAll(tens));

        boolean disJoint = Collections.disjoint(deck,tens);
        System.out.println("disJoint = " + disJoint);

        boolean disJoint2 = Collections.disjoint(kings,tens);
        System.out.println("disJoint2 = " + disJoint2);

        deck.sort(sortingAlgorithm);
        Card tenOfHearts = Card.getNumericCard(Card.Suit.HEART,10);
        int foundIndex = Collections.binarySearch(deck,tenOfHearts,sortingAlgorithm);
        System.out.println("foundIndex = " + foundIndex);
        System.out.println("foundIndex = " + deck.indexOf(tenOfHearts));
        System.out.println(deck.get(foundIndex));

        Card tenOfClubs = Card.getNumericCard(Card.Suit.CLUB,10);
        Collections.replaceAll(deck,tenOfClubs,tenOfHearts);
        Card.printDeck(deck.subList(32,36),"Tens Row",1);

        Collections.replaceAll(deck,tenOfHearts,tenOfClubs);
        Card.printDeck(deck.subList(32,36),"Tens Row",1);

        if (Collections.replaceAll(deck,tenOfHearts,tenOfClubs)){
            System.out.println("Tens Of Hearts Replaced With Tens Of Clubs");
        }else {
            System.out.println("No Tens Of Heart Found In The List ");
        }
        System.out.println("Tens of Clubs Cards = " + Collections.frequency(deck,tenOfClubs));

        System.out.println("Best Card = " + Collections.max(deck,sortingAlgorithm));
        System.out.println("Worst Card = " + Collections.min(deck,sortingAlgorithm));

        var sortBySuit = Comparator.comparing(Card::suit).thenComparing(Card::rank);

        deck.sort(sortBySuit);
        Card.printDeck(deck,"Sorted By Suit, Rank ",4);

        List<Card> copied = new ArrayList<>(deck.subList(0,13));
        Collections.rotate(copied,2);
        System.out.println("UnRotated: " + deck.subList(0,13));
        System.out.println("Rotated " + 2 + " : " + copied );

        copied = new ArrayList<>(deck.subList(0,13));
        Collections.rotate(copied,-2);
        System.out.println("UnRotated: " + deck.subList(0,13));
        System.out.println("Rotated " + -2 + " : " + copied );

        copied = new ArrayList<>(deck.subList(0,13));
        for (int i = 0 ; i < copied.size() / 2 ; i++ ){
            Collections.swap(copied, i, copied.size() - 1 - i);
        }
        System.out.println("Manual reverse : "+copied);

        copied = new ArrayList<>(deck.subList(0,13));
        Collections.reverse(copied);
        System.out.println("Using reverse : "+copied);

    }
}
