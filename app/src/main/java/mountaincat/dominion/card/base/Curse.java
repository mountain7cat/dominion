package mountaincat.dominion.card.base;

import mountaincat.dominion.card.Card;
import mountaincat.dominion.card.Type;

/**
 * Created by samslee on 2/20/15.
 */
public class Curse extends Card {

	private static Curse mInstance = new Curse();

	private Curse() {
	}

	public static Curse getInstance() {
		return mInstance;
	}

	@Override
	public Type getType() {
		return Type.CURSE;
	}

	@Override
	public void onGain() {

	}

	@Override
	public void onBuy() {

	}

	@Override
	public void onPlay() {

	}

	@Override
	public void onDiscard() {

	}

	@Override
	public void onTrash() {

	}
}
