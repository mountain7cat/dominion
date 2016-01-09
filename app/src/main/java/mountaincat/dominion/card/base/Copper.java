package mountaincat.dominion.card.base;

import mountaincat.dominion.card.Card;
import mountaincat.dominion.card.Treasure;
import mountaincat.dominion.card.Type;

/**
 * Created by samslee on 2/14/15.
 */
public class Copper extends Card implements Treasure {

	private static Copper mInstance = new Copper();

	private Copper() {
	}

	public static Copper getInstance() {
		return mInstance;
	}

	@Override
	public Type getType() {
		return Type.COPPER;
	}

	@Override
	public void onGain() {

	}

	@Override
	public void onBuy() {
		onGain();
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

	@Override
	public int getValue() {
		return 1;
	}
}
