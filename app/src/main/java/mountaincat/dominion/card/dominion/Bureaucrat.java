package mountaincat.dominion.card.dominion;

import mountaincat.dominion.Game;
import mountaincat.dominion.card.Action;
import mountaincat.dominion.card.Box;
import mountaincat.dominion.card.Card;
import mountaincat.dominion.players.Player;

public class Bureaucrat extends Card implements Action {

	private static final Bureaucrat mInstance = new Bureaucrat();

	private Bureaucrat() {
	}

	public static Bureaucrat getInstance() {
		return mInstance;
	}

    @Override
    public Box getBox() {
        return Box.DOMINION;
    }

    @Override
	public void doAction(Game game, Player player) {

	}
}
