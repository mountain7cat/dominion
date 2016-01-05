package mountaincat.dominion.card;

/**
 * Created by samslee on 2/14/15.
 */
public enum Type {
	COPPER( Copper.getInstance() ),
	SILVER( Silver.getInstance() ),
	GOLD( Gold.getInstance() ),
	ESTATE( Estate.getInstance() ),
	DUCHY( Duchy.getInstance() ),
	PROVINCE( Province.getInstance() ),
	CURSE( Curse.getInstance() );

	private Card mInstance;

	Type( Card card ) {
		mInstance = card;
	}

	public Card getCard() {
		return mInstance;
	}
}
