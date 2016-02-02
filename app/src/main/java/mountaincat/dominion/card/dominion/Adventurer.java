package mountaincat.dominion.card.dominion;

import mountaincat.dominion.card.Box;
import mountaincat.dominion.card.Card;

public class Adventurer extends Card {

    private static final Adventurer mInstance = new Adventurer();

    public static Card getInstance() {
        return mInstance;
    }

    @Override
    public Box getBox() {
        return Box.DOMINION;
    }
}
