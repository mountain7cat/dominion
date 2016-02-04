package mountaincat.dominion.card.base;

import mountaincat.dominion.card.Box;
import mountaincat.dominion.card.Card;
import mountaincat.dominion.card.Victory;

public class Colony extends Card implements Victory {

    private static final Colony mInstance = new Colony();

    public static Card getInstance() {
        return mInstance;
    }

    private Colony() {
    }

    @Override
    public Box getBox() {
        return Box.BASE;
    }

    @Override
    public int getVictoryPoint() {
        return 10;
    }
}
