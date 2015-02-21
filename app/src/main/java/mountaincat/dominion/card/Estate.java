package mountaincat.dominion.card;

/**
 * Created by samslee on 2/20/15.
 */
public class Estate extends Card implements Victory {
    @Override
    public Type getType() {
        return Type.ESTATE;
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
        return 1;
    }
}
