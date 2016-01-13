package mountaincat.dominion.card;

/**
 * interface for a dominion card
 */

public class Card {

	protected Card() {
	}

	public Type getType() {
		return null;
	}

	public void onGain() {
		// no op
	}

	public void onBuy() {
		// no op
	}

	public void onPlay() {
		// no op
	}

	public void onDiscard() {
		// no op
	}

	public void onTrash() {
		// no op
	}
}
