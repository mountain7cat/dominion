package mountaincat.dominion.card.base;

import mountaincat.dominion.card.Card;
import mountaincat.dominion.card.Type;
import mountaincat.dominion.card.Victory;

/**
 * Created by samslee on 2/20/15.
 */
public class Estate extends Card implements Victory {

	private static Estate mInstance = new Estate();

	private Estate() {
	}

	public static Estate getInstance() {
		return mInstance;
	}

	@Override
	public Type getType() {
		return Type.ESTATE;
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

	@Override
	public int getVictoryPoint() {
		return 1;
	}
}
