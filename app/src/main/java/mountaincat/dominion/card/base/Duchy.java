package mountaincat.dominion.card.base;

import mountaincat.dominion.card.Box;
import mountaincat.dominion.card.Card;
import mountaincat.dominion.card.Type;
import mountaincat.dominion.card.Victory;

/**
 * Created by samslee on 2/20/15.
 */
public class Duchy extends Card implements Victory {

	private static final Duchy mInstance = new Duchy();

	private Duchy() {
	}

	public static Duchy getInstance() {
		return new Duchy();
	}

	@Override
	public Type getType() {
		return Type.DUCHY;
	}

    @Override
    public Box getBox() {
        return Box.BASE;
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
		return 3;
	}
}
