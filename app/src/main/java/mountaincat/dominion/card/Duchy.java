package mountaincat.dominion.card;

/**
 * Created by samslee on 2/20/15.
 */
public class Duchy extends Card implements Victory {

	private static Duchy mInstance = new Duchy();

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
