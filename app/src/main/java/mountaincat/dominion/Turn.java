package mountaincat.dominion;

public class Turn {
	private int mBuys = 1;
	private int mActions = 1;

	public void increaseBuy() {
		mBuys++ ;
	}

	public void decreaseBuy() {
		mBuys-- ;

		if ( mBuys < 0 ) {
			throw new IllegalStateException( "negative buys for turn" );
		}
	}

	public void increaseAction() {
		mActions++ ;
	}

	public void decreaseAction() {
		mActions-- ;

		if ( mActions < 0 ) {
			throw new IllegalStateException( "negative actions for turn" );
		}
	}
}
