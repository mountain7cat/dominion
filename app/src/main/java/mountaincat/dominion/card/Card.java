package mountaincat.dominion.card;

/**
 * interface for a dominion card
 */

public interface Card {
    public Type getType();

    public void onGain();

    public void onBuy();

    public void onPlay();

    public void onDiscard();

    public void onTrash();
}