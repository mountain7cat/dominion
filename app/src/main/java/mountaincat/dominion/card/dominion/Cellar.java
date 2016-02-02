package mountaincat.dominion.card.dominion;

import mountaincat.dominion.card.Box;
import mountaincat.dominion.card.Card;

public class Cellar extends Card {

    private static final Cellar mInstance = new Cellar();

    public static Card getInstance() {
        return mInstance;
    }

    @Override
    public Box getBox() {
        return Box.DOMINION;
    }
}
