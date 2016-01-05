package mountaincat.dominion.card;

/**
 * Created by samslee on 2/20/15.
 */
public class Province extends Card implements Victory {

	private static Province mInstance = new Province();

	private Province() {
	}

	public static Province getInstance() {
		return mInstance;
	}

	@Override
	public Type getType() {
		return Type.PROVINCE;
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
		return 6;
	}
}
