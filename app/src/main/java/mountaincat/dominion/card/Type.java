package mountaincat.dominion.card;

/**
 * Created by samslee on 2/14/15.
 */
public enum Type {
    COPPER,
    SILVER,
    GOLD,
    ESTATE,
    DUCHY,
    PROVINCE,
    CURSE;

    public static Card getNewCard(Type type) {
        switch (type) {
            case COPPER:
                return new Copper();
            case SILVER:
                return new Silver();
            case GOLD:
                return new Gold();
            case ESTATE:
                return new Estate();
            case DUCHY:
                return new Duchy();
            case PROVINCE:
                return new Province();
            case CURSE:
                return new Curse();
            default:
                throw new IllegalStateException();
        }
    }
}
