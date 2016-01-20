package mountaincat.dominion.card.base;

import mountaincat.dominion.card.Box;
import mountaincat.dominion.card.Card;
import mountaincat.dominion.card.Treasure;

public class Platinum extends Card implements Treasure {

    public static Card getInstance() {
        return null;
    }

    @Override
    public Box getBox() {
        return Box.BASE;
    }

    @Override
    public int getValue() {
        return 5;
    }
}
