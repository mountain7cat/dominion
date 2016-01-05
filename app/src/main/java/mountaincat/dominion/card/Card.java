package mountaincat.dominion.card;

import mountaincat.dominion.players.Player;
/**
 * interface for a dominion card
 */

public abstract class Card {

    private Player owner = Player.NOPLAYER;

    abstract public Type getType();

    abstract public void onGain();

    abstract public void onBuy();

    abstract public void onPlay();

    abstract public void onDiscard();

    abstract public void onTrash();

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player player) {
        owner = player;
    }

    public static Card getNew(Type type) {
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