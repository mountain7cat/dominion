package mountaincat.dominion.card.dominion;

import mountaincat.dominion.Game;
import mountaincat.dominion.card.Action;
import mountaincat.dominion.card.Box;
import mountaincat.dominion.card.Card;
import mountaincat.dominion.players.Player;

public class Chancellor extends Card implements Action {

    private static final Chancellor mInstance = new Chancellor();

    public static Chancellor getInstance(){
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
