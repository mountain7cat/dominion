package mountaincat.dominion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import mountaincat.dominion.Exception.KingdomPileEmptyException;
import mountaincat.dominion.card.Card;
import mountaincat.dominion.card.Type;
import mountaincat.dominion.players.Player;

/**
 * Created by samslee on 2/14/15.
 */
public class Game {
	private final List<Player> players = new ArrayList<>();
	private Map<Type, Integer> kingdom = new HashMap<>();

	public Game( List<Player> players ) {
		players.addAll( players );
	}


	public void start() {

	}

	public void setup() {
		selectCards();
	}

	private List<Type> getAvailableTypes() {
		// TODO: 1/4/16 choose only kingdom cards
		return Arrays.asList( Type.values() );
	}

	private int getKingdomSize() {
		return 10;
	}

	private void selectCards() {
		List<Type> types = shuffle( getAvailableTypes() );
		int c = 0;
		while ( c++ < getKingdomSize() ) {
			kingdom.put( types.get( c ), 10 );
		}
	}

	public Card getFromKingdom( Type type ) throws KingdomPileEmptyException {
		int amount = kingdom.get( type );
		if ( amount == 0 ) {
			throw new KingdomPileEmptyException( type );
		}
		kingdom.put( type, amount - 1 );
		return type.getCard();
	}

	public static <T> List<T> shuffle( List<T> deck ) {
		Random rand = new Random();
		for ( int i = deck.size() - 1; i > 0; i-- ) {
			int j = rand.nextInt( i );
			T c = deck.remove( i );
			deck.add( i, deck.get( j ) );
			deck.remove( j );
			deck.add( j, c );
		}
		return deck;
	}
}
