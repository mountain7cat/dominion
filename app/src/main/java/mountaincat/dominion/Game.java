package mountaincat.dominion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import mountaincat.dominion.Exception.KingdomPileEmptyException;
import mountaincat.dominion.card.Box;
import mountaincat.dominion.card.Card;
import mountaincat.dominion.card.Type;
import mountaincat.dominion.card.base.Copper;
import mountaincat.dominion.card.base.Estate;
import mountaincat.dominion.players.BigMoneyPlayer;
import mountaincat.dominion.players.Player;

/**
 * Created by samslee on 2/14/15.
 */
public class Game {
    private final List<Player> mPlayers = new ArrayList<>();
    private Map<Type, Integer> mKingdom = new HashMap<>();

    private Game(List<Player> players) {
        players.addAll(players);
    }

    public static Game newGame() {
        List<Player> players = new ArrayList<>();
        players.add(new Player());
        players.add(new BigMoneyPlayer());
        players.add(new BigMoneyPlayer());
        players.add(new BigMoneyPlayer());
        return new Game(players);
    }

    public void start() {
        selectCards();
        for (Player player : mPlayers) {
            Tableau tableau = player.getTableau();
            for (int i = 0; i < 7; i++) {
                tableau.gainCard(Copper.getInstance());
            }
            for (int i = 0; i < 3; i++) {
                tableau.gainCard(Estate.getInstance());
            }
            tableau.drawNewHand();
        }
    }

    public void setup() {
        selectCards();
    }

    private int getKingdomSize() {
        return 10;
    }

    private void selectCards() {
        List<Type> types = shuffle(Arrays.asList(Type.values()));
        int i = 0;
        while (mKingdom.size() < getKingdomSize()) {
            if (types.get(i).getCard().getBox() != Box.BASE) {
                mKingdom.put(types.get(i), 10);
            }
            i++;
        }
    }

    public Card getFromKingdom(Type type) throws KingdomPileEmptyException {
        int amount = mKingdom.get(type);
        if (amount == 0) {
            throw new KingdomPileEmptyException(type);
        }
        mKingdom.put(type, amount - 1);
        return type.getCard();
    }

    public static <T> List<T> shuffle(List<T> deck) {
        Random rand = new Random();
        for (int i = deck.size() - 1; i > 0; i--) {
            int j = rand.nextInt(i);
            T c = deck.remove(i);
            deck.add(i, deck.get(j));
            deck.remove(j);
            deck.add(j, c);
        }
        return deck;
    }
}
