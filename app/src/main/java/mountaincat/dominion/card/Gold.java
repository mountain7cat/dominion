package mountaincat.dominion.card;

/**
 * Created by samslee on 2/20/15.
 */
public class Gold implements Card, Treasure {
    @Override
    public Type getType() {
        return Type.GOLD;
    }

    @Override
    public void onGain() {

    }

    @Override
    public void onBuy() {

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
        return 3;
    }
}