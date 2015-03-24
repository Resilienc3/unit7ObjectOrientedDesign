import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

    /**
     * The size (number of cards) on the board.
     */
    private static final int BOARD_SIZE = 9;

    /**
     * The ranks of the cards for this game to be sent to the deck.
     */
    private static final String[] RANKS =
        {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    /**
     * The suits of the cards for this game to be sent to the deck.
     */
    private static final String[] SUITS =
        {"spades", "hearts", "diamonds", "clubs"};

    /**
     * The values of the cards for this game to be sent to the deck.
     */
    private static final int[] POINT_VALUES =
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

    /**
     * Flag used to control debugging print statements.
     */
    private static final boolean I_AM_DEBUGGING = false;

    /**
     * Creates a new <code>ElevensBoard</code> instance.
     */
    public ElevensBoard() {
        super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
    }

    /**
     * Determines if the selected cards form a valid group for removal.
     * In Elevens, the legal groups are (1) a pair of non-face cards
     * whose values add to 11, and (2) a group of three cards consisting of
     * a jack, a queen, and a king in some order.
     * @param selectedCards the list of the indices of the selected cards.
     * @return true if the selected cards form a valid group for removal;
     *         false otherwise.
     */
    @Override
    public boolean isLegal(List<Integer> selectedCards) {
        if(this.containsPairSum11(selectedCards) || this.containsJQK(selectedCards))

            return true;

        else
            return false;
    }

    /**
     * Determine if there are any legal plays left on the board.
     * In Elevens, there is a legal play if the board contains
     * (1) a pair of non-face cards whose values add to 11, or (2) a group
     * of three cards consisting of a jack, a queen, and a king in some order.
     * @return true if there is a legal play left on the board;
     *         false otherwise.
     */
    @Override
    public boolean anotherPlayIsPossible() {
        
        boolean state = false;
        for(int i = 0; i < 9; i++)
        {
            for(int k = 0; k<9; k++)
            {
                List<Integer> cards = new ArrayList();
                cards.add(i);
                cards.add(k);
                state = isLegal(cards);
                if(state == true)
                    return true;
                else
                {
                    for(int j = 0; j < 9; j++)
                    {
                        cards.add(j);
                        state =this.isLegal(cards);
                        if(state == true)
                            return true;
                    }

                }
            }
        }
        return state;
    }

    /**
     * Check for an 11-pair in the selected cards.
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find an 11-pair.
     * @return true if the board entries in selectedCards
     *              contain an 11-pair; false otherwise.
     */
    private boolean containsPairSum11(List<Integer> selectedCards) {
        List<Card> cards = new ArrayList();
        for(int i = 0; i < selectedCards.size(); i++)
        {
            cards.add(cardAt(selectedCards.get(i)));
        }

        if(cards.size() == 2)
        {
            if(cards.get(1).pointValue() + cards.get(0).pointValue() == 11)
                return true;
            else
                return false;
        }
        else
            return false;
    }

    /**
     * Check for a JQK in the selected cards.
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find a JQK group.
     * @return true if the board entries in selectedCards
     *              include a jack, a queen, and a king; false otherwise.
     */
    private boolean containsJQK(List<Integer> selectedCards) {
        List<Card> cards = new ArrayList();
        int jacks = 0, queens = 0, kings = 0;
        boolean state = false;
        for(int i = 0; i < selectedCards.size(); i++)
        {
            cards.add(cardAt(selectedCards.get(i)));
        }

        if(cards.size() == 3)
        {
            for(int i = 0; i < 3; i++)
            {
                if(cards.get(i).rank().equals("jack"))
                {
                    jacks+= 1;
                }

                else if(cards.get(i).rank().equals("queen"))
                {
                    queens+= 1;
                }
                else if(cards.get(i).rank().equals("king"))
                {
                    kings+= 1;
                }
                else
                {
                    state = false;
                }
            }

            if(jacks == 1 && queens == 1 && kings == 1)
                state = true;
        }
        else
            state = false;
        return state;
    }
}
