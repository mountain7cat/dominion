package mountaincat.dominion;

import java.util.ArrayList;
import java.util.List;

import mountaincat.dominion.card.Card;
import mountaincat.dominion.card.base.Copper;

public class Tableau {

    private final List<Card> mDiscardPile = new ArrayList<>();
    private final List<Card> mDeck = new ArrayList<>();
    private final List<Card> mPlayed = new ArrayList<>();
    private final List<Card> mHand = new ArrayList<>();

    public List<Card> getDiscardPile() {
        return mDiscardPile;
    }

    public List<Card> getHand() {
        return mHand;
    }

    public List<Card> getDeck() {
        return mDeck;
    }

    public List<Card> getPlayed() {
        return mPlayed;
    }

    public void discard(Card card) {
        mDiscardPile.add(card);
    }

    public Card draw() {
        if (mDeck.isEmpty()) {
            mDeck.addAll(Game.shuffle(mDiscardPile));
            mDiscardPile.clear();
        }
        return mDeck.remove(0);
    }

    public void drawNewHand() {
        mDiscardPile.addAll(mHand);
        mHand.clear();
        for (int i = 0; i < 5; i++) {
            mHand.add(draw());
        }
    }

    public void cleanUp() {
        mDiscardPile.addAll(mPlayed);
        mPlayed.clear();
        drawNewHand();
    }

    public void gainCard(Card card) {
        mDiscardPile.add(card);
    }
}
