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
import mountaincat.dominion.card.dominion.Adventurer;
import mountaincat.dominion.card.dominion.Bureaucrat;
import mountaincat.dominion.card.dominion.Cellar;
import mountaincat.dominion.card.dominion.Chapel;
import mountaincat.dominion.card.dominion.CouncilRoom;
import mountaincat.dominion.card.dominion.Feast;
import mountaincat.dominion.card.dominion.Festival;
import mountaincat.dominion.card.dominion.Gardens;
import mountaincat.dominion.card.dominion.Laboratory;
import mountaincat.dominion.card.dominion.Library;
import mountaincat.dominion.card.dominion.Market;
import mountaincat.dominion.card.dominion.Militia;
import mountaincat.dominion.card.dominion.Mine;
import mountaincat.dominion.card.dominion.Moat;
import mountaincat.dominion.card.dominion.Moneylender;
import mountaincat.dominion.card.dominion.Remodel;
import mountaincat.dominion.card.dominion.Smithy;
import mountaincat.dominion.card.dominion.Spy;
import mountaincat.dominion.card.dominion.Thief;
import mountaincat.dominion.card.dominion.ThroneRoom;
import mountaincat.dominion.card.dominion.Village;
import mountaincat.dominion.card.dominion.Witch;
import mountaincat.dominion.card.dominion.Woodcutter;
import mountaincat.dominion.card.dominion.Workshop;

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
	CURSE( Curse.getInstance() ),
	ADVENTURER( Adventurer.getInstance() ),
	BUREAUCRAT( Bureaucrat.getInstance() ),
	CELLAR( Cellar.getInstance() ),
	CHANCELLOR( Bureaucrat.getInstance() ),
	CHAPEL( Chapel.getInstance() ),
	COUNCILROOM( CouncilRoom.getInstance() ),
	FEAST( Feast.getInstance() ),
	FESTIVAL( Festival.getInstance() ),
	GARDENS( Gardens.getInstance() ),
	LABORATORY( Laboratory.getInstance() ),
	LIBRARY( Library.getInstance() ),
	MARKET( Market.getInstance() ),
	MILITIA( Militia.getInstance() ),
	MINE( Mine.getInstance() ),
	MOAT( Moat.getInstance() ),
	MONEYLENDER( Moneylender.getInstance() ),
	REMODEL( Remodel.getInstance() ),
	SMITHY( Smithy.getInstance() ),
	SPY( Spy.getInstance() ),
	THIEF( Thief.getInstance() ),
	THRONEROOM( ThroneRoom.getInstance() ),
	VILLAGE( Village.getInstance() ),
	WITCH( Witch.getInstance() ),
	WOODCUTTER( Woodcutter.getInstance() ),
	WORKSHOP( Workshop.getInstance() );

	private Card mInstance;

	Type( Card card ) {
		mInstance = card;
	}

	public Card getCard() {
		return mInstance;
	}
}
