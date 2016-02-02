package mountaincat.dominion.card.dominion;

import mountaincat.dominion.card.Card;

public class Gardens extends Card {

    private static final Gardens mInstance = new Gardens();

    public static Card getInstance() {
        return mInstance;
    }
}
