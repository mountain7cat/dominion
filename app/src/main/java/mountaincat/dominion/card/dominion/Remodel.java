package mountaincat.dominion.card.dominion;

import mountaincat.dominion.Game;
import mountaincat.dominion.card.Action;
import mountaincat.dominion.card.Card;
import mountaincat.dominion.players.Player;

public class Remodel extends Card implements Action {

    private static final Remodel mInstance = new Remodel();

    private Remodel() {
    }

    public static Card getInstance() {
        return mInstance;
    }

    @Override
    public void doAction(Game game, Player player) {

    }
}
