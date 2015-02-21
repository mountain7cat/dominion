package mountaincat.dominion;

import java.util.List;
import java.util.Random;

import mountaincat.dominion.card.Card;
import mountaincat.dominion.card.Type;
/**
 * Created by samslee on 2/14/15.
 */
public class Game {
    private List<Type> cardTypes;
    private List<Card> cards;
    private List<Player> players;

    public void setup() {
        selectCards();
        setNumberOfPlayers();
    }

    private void setNumberOfPlayers() {

    }

    private void selectCards() {
        Random rand = new Random();
        int totalType = Type.values().length;
        int amount = 10;
        while (amount > 0) {
            int randNum = rand.nextInt(totalType);
        }

        for (Type cardType : cardTypes) {

        }
    }

    public void start() {

    }
}
