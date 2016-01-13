package mountaincat.dominion.card;

import mountaincat.dominion.Game;
import mountaincat.dominion.players.Player;

/**
 * Created by samslee on 1/8/16.
 */
public interface Action {

    void doAction(Game game, Player player);
}
