package mountaincat.dominion.card;

import mountaincat.dominion.card.base.Colony;
import mountaincat.dominion.card.base.Copper;
import mountaincat.dominion.card.base.Curse;
import mountaincat.dominion.card.base.Duchy;
import mountaincat.dominion.card.base.Estate;
import mountaincat.dominion.card.base.Gold;
import mountaincat.dominion.card.base.Platinum;
import mountaincat.dominion.card.base.Province;
import mountaincat.dominion.card.base.Silver;

/**
 * Created by samslee on 2/14/15.
 */
public enum Type {
	COPPER( Copper.getInstance() ),
	SILVER( Silver.getInstance() ),
	GOLD( Gold.getInstance() ),
	PLATINUM( Platinum.getInstance() ),
	ESTATE( Estate.getInstance() ),
	DUCHY( Duchy.getInstance() ),
	PROVINCE( Province.getInstance() ),
	COLONY( Colony.getInstance() ),
	CURSE( Curse.getInstance() );

	private Card mInstance;

	Type( Card card ) {
		mInstance = card;
	}

	public Card getCard() {
		return mInstance;
	}
}
