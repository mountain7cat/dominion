package mountaincat.dominion.card.dominion;

import mountaincat.dominion.Game;
import mountaincat.dominion.card.Action;
import mountaincat.dominion.card.Card;
import mountaincat.dominion.players.Player;

public class Thief extends Card implements Action {

    private static final Thief mInstance = new Thief();

    private Thief() {
    }

    public static Card getInstance() {
        return mInstance;
    }

    @Override
    public void doAction(Game game, Player player) {

    }
}
