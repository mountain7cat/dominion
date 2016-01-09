package mountaincat.dominion.card.dominion;

import mountaincat.dominion.Game;
import mountaincat.dominion.Tableau;
import mountaincat.dominion.card.Action;
import mountaincat.dominion.card.Card;

public class Bureaucrat extends Card implements Action {

	private static Bureaucrat mInstance = new Bureaucrat();

	private Bureaucrat() {
	}

	public static Bureaucrat getInstance() {
		return mInstance;
	}

	@Override
	public void doAction( Game game, Tableau tableau ) {

	}
}
