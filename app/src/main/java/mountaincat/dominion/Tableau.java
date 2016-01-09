package mountaincat.dominion;

import java.util.ArrayList;
import java.util.List;

import mountaincat.dominion.card.Card;

public class Tableau {

	private final List<Card> mDiscardPile = new ArrayList<>();
	private final List<Card> mDeck = new ArrayList<>();
	private final List<Card> mPlayed = new ArrayList<>();

	public List<Card> getDiscardPile() {
		return mDiscardPile;
	}

	public List<Card> getDeck() {
		return mDeck;
	}

	public List<Card> getPlayed() {
		return mPlayed;
	}

	public void discard( Card card ) {
		mDiscardPile.add( card );
	}

	public Card draw() {
		if ( mDeck.isEmpty() ) {
			mDeck.addAll( Game.shuffle( mDiscardPile ) );
			mDiscardPile.clear();
		}
		return mDeck.remove( 0 );
	}

	public List<Card> drawNewHand() {
		List<Card> newHand = new ArrayList<>();
		for ( int i = 0; i < 5; i++ ) {
			newHand.add( draw() );
		}
		return newHand;
	}

    public void cleanUp() {
        mDiscardPile.addAll(mPlayed);
        mPlayed.clear();
        drawNewHand();
    }
}
