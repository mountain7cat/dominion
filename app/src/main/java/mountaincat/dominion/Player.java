package mountaincat.dominion;

import java.util.ArrayList;
import java.util.List;

import mountaincat.dominion.card.Card;
/**
 * Created by samslee on 2/14/15.
 */
public class Player {
    private final List<Card> deck = new ArrayList<Card>();
    private final List<Card> hand = new ArrayList<Card>();


    public List<Card> getDeck() {
        return deck;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void addDiscardPileToDeck(List<Card> discardPile) {
        deck.addAll(discardPile);
    }

    public void shuffleDeck() {
        //do shuffle
    }

    public void drawNewHand() {
        int handSize = 5;
        while (handSize > 0) {
            hand.add(deck.remove(0));
            handSize--;
        }
    }
}
