package mountaincat.dominion.Exception;

import mountaincat.dominion.card.Type;
/**
 * Created by samslee on 2/20/15.
 */
public class KingdomPileEmptyException extends Throwable {
    private Type type;

    public KingdomPileEmptyException(Type t) {
        type = t;
    }

    @Override
    public String toString() {
        return type + " pile is empty";
    }
}
