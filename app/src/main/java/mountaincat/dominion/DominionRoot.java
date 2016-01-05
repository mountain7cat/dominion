package mountaincat.dominion;

import java.util.ArrayList;
import java.util.List;

import mountaincat.dominion.players.BigMoneyPlayer;
import mountaincat.dominion.players.Player;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;


public class DominionRoot extends FragmentActivity {

	private Game mGame;

	@Override
	protected void onCreate( Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );
		setContentView( R.layout.dominion_root );
		// TODO: 1/4/16 add a start game dialog box
		List<Player> players = new ArrayList<>();
		players.add( new Player() );
		players.add( new BigMoneyPlayer() );
		players.add( new BigMoneyPlayer() );
		players.add( new BigMoneyPlayer() );
		mGame = new Game( players );
		mGame.start();
	}


	@Override
	public boolean onCreateOptionsMenu( Menu menu ) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate( R.menu.dominion_root, menu );
		return true;
	}

	@Override
	public boolean onOptionsItemSelected( MenuItem item ) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if ( id == R.id.action_settings ) {
			return true;
		}
		return super.onOptionsItemSelected( item );
	}
}
