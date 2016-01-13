package mountaincat.dominion.players;

import java.util.List;

import mountaincat.dominion.Tableau;
import mountaincat.dominion.card.Card;

/**
 * Created by samslee on 2/14/15.
 */
public class Player {

	private final Tableau mTableau = new Tableau();

	public final static Player NOBODY = new Player();

	public Tableau getTableau() {
		return mTableau;
	}

	public List<Card> getDeck() {
		return mTableau.getDeck();
	}

	public List<Card> getHand() {
		return mTableau.getHand();
	}

}
