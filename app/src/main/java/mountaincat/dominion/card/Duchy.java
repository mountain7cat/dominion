package mountaincat.dominion.card;

/**
 * Created by samslee on 2/20/15.
 */
public class Duchy implements Card, Victory {
    @Override
    public Type getType() {
        return Type.DUCHY;
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
    public int getVictoryPoint() {
        return 3;
    }
}
