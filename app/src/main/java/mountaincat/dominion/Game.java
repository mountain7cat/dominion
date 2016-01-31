package mountaincat.dominion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
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

    private static final int NORMAL_KINGDOM_SIZE = 10;

    private final Queue<Player> mPlayers = new PriorityQueue<>();
    private final Map<Type, Integer> mKingdom = new HashMap<>();
    private final Map<Type, Integer> mBasePiles = new HashMap<>();
    private int mEmptyPiles = 0;

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
        initalizeBaseCards();
        selectKingdom();
        initializePlayersDeck();
        startTurn(mPlayers.poll());
        cleanupGame();
    }

    private void cleanupGame() {
        // TODO: 1/21/16 game ended need to show that on the UI
    }

    private boolean gameOver() {
        // TODO: 1/21/16 figure out colony winning condition
        return mEmptyPiles == 3 || mBasePiles.get(Type.PROVINCE) == 0;
    }

    public void startTurn(Player player) {

    }

    public void endTurn() {

    }

    private void initalizeBaseCards() {
        mBasePiles.put(Type.COPPER, 60 - 7 * mPlayers.size());
        mBasePiles.put(Type.SILVER, 40);
        mBasePiles.put(Type.GOLD, 30);
        mBasePiles.put(Type.ESTATE, mPlayers.size() > 2 ? 12 : 8);
        mBasePiles.put(Type.DUCHY, mPlayers.size() > 2 ? 12 : 8);
        mBasePiles.put(Type.PROVINCE, mPlayers.size() > 2 ? 12 : 8);
        mBasePiles.put(Type.CURSE, 10 * (mPlayers.size() - 1));
        // TODO: 1/21/16 figure out prosperity platinum and colony
    }

    private void initializePlayersDeck() {
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

    private int getKingdomSize() {
        return mKingdom.keySet().size();
    }

    private void selectKingdom() {
        List<Type> types = shuffle(Arrays.asList(Type.values()));
        int i = 0;
        while (mKingdom.size() < NORMAL_KINGDOM_SIZE) {
            if (types.get(i).getCard().getBox() != Box.BASE) {
                mKingdom.put(types.get(i), 10);
            }
            i++;
        }

        for (Type type : mKingdom.keySet()) {
            type.getCard().onStart();
        }
    }

    public Card getFromKingdom(Type type) throws KingdomPileEmptyException {
        int amount = mKingdom.get(type);
        if (amount == 0) {
            throw new KingdomPileEmptyException(type);
        }

        if (--amount == 0) {
            mEmptyPiles++;
        }

        mKingdom.put(type, amount);
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
