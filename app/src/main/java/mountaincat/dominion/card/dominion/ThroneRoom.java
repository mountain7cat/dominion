package mountaincat.dominion.card.dominion;

import mountaincat.dominion.Game;
import mountaincat.dominion.card.Action;
import mountaincat.dominion.card.Card;
import mountaincat.dominion.players.Player;

public class ThroneRoom extends Card implements Action {

    private static final ThroneRoom mInstance = new ThroneRoom();

    private ThroneRoom() {
    }

    public static Card getInstance() {
        return mInstance;
    }

    @Override
    public void doAction(Game game, Player player) {

    }
}
