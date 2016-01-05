package mountaincat.dominion.card;

/**
 * Created by samslee on 2/20/15.
 */
public class Silver extends Card implements Treasure {

	private static final Silver mInstance = new Silver();

	private Silver() {
	}

	public static Silver getInstance() {
		return mInstance;
	}

	@Override
	public Type getType() {
		return Type.SILVER;
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
	public int getValue() {
		return 2;
	}
}
