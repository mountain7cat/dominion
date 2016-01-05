package mountaincat.dominion;

import mountaincat.dominion.card.Card;

/**
 * Represent a group of the same cards; used in a hand (a list of piles), in trash (a list of piles)
 * piles,etc
 */
public class Pile {
	// TODO: 1/4/16 think about what a pile need and implement
	private int mSize = 0;
	private Card mCard;

	public Pile( Card card ) {
		mCard = card;
	}

	public Card getCard() {
		return mCard;
	}

	public int getSize() {
		return mSize;
	}

	public void setSize( int mSize ) {
		this.mSize = mSize;
	}

	public void increaseSize() {
		mSize++ ;
	}

	public void decreaseSize() {
		mSize-- ;
	}
}
