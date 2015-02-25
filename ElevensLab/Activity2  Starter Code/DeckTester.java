/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"face", "number"};
        String[] ranks2 = {"derp", "ferp"};
        String[] suits = {"hearts", "diamonds", "clubs", "spades"};
        String[] suits2 = {"water", "fire", "earth", "air"};
        int[] values= {1, 2 , 3, 4};
        Deck deck1 = new Deck(ranks, suits, values);
        Deck deck2 = new Deck(ranks2, suits2, values);
        Deck deck3 = new Deck(ranks, suits2, values);

        System.out.print("\n\ndeck1.isEmpty(card2): "+ deck1.isEmpty()) ;
        System.out.print("\n\ndeck1.size(): "+deck1.size());
        System.out.print("\n\ndeck1.deal(): "+deck1.deal());
        System.out.print("\n\ndeck1.toString(): "+deck1.toString());
        
        System.out.print("\n\ndeck2.isEmpty(card2): "+ deck2.isEmpty()) ;
        System.out.print("\n\ndeck2.size(): "+deck2.size());
        System.out.print("\n\ndeck2.deal(): "+deck2.deal());
        System.out.print("\n\ndeck2.toString(): "+deck2.toString());
        
        System.out.print("\n\ndeck3.isEmpty(card2): "+ deck3.isEmpty()) ;
        System.out.print("\n\ndeck3.size(): "+deck3.size());
        System.out.print("\n\ndeck3.deal(): "+deck3.deal());
        System.out.print("\n\ndeck3.toString(): "+deck3.toString());
    }
}
