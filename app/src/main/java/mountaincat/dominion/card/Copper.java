package mountaincat.dominion.card;

/**
 * Created by samslee on 2/14/15.
 */
public class Copper implements Card, Treasure {
    @Override
    public Type getType() {
        return Type.COPPER;
    }

    @Override
    public void onGain() {

    }

    @Override
    public void onBuy() {
        onGain();
    }

    @Override
    public void onPlay() {
    }

    @Override
    public void onDiscard() {

    }

    @Override
    public void onTrash() {

    }

    @Override
    public int getValue() {
        return 1;
    }
}
