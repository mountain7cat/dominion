package mountaincat.dominion.card.dominion;

import mountaincat.dominion.Game;
import mountaincat.dominion.card.Action;
import mountaincat.dominion.card.Card;
import mountaincat.dominion.players.Player;

public class Woodcutter extends Card implements Action {

    private static final Woodcutter mInstance = new Woodcutter();

    private Woodcutter() {
    }

    public static Card getInstance() {
        return mInstance;
    }

    @Override
    public void doAction(Game game, Player player) {

    }
}
