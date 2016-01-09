package mountaincat.dominion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class DominionRoot extends FragmentActivity {

	private Game mGame;
	private View mCardView;
	private View mCardName;
	private View mMiscellaneous;
	private View mImg1;
	private View mImg2;
	private View mImg3;
	private Button mRevealButton;
	private Button mHideButton;

	@Override
	protected void onCreate( Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );
		setContentView( R.layout.sample );
		mCardView = findViewById( R.id.card );
		mCardName = findViewById( R.id.cardName );
		mMiscellaneous = findViewById( R.id.miscellaneous );
		mImg1 = findViewById( R.id.img1 );
		mImg2 = findViewById( R.id.img2 );
		mImg3 = findViewById( R.id.img3 );
		mRevealButton = (Button) findViewById( R.id.revealButton );
		mHideButton = (Button) findViewById( R.id.hideButton );

		mCardView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(DominionRoot.this, SecondActivity.class);
				Pair<View, String> p1 = Pair.create(mCardName, "cardName");
				Pair<View, String> p2 = Pair.create(mMiscellaneous, "miscellaneous");

				ActivityOptionsCompat options =
						ActivityOptionsCompat.makeSceneTransitionAnimation(DominionRoot.this, p1, p2);
				startActivity(intent, options.toBundle());
			}
		});

		mRevealButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				AnimationUtil.enterReveal(mImg1);
				AnimationUtil.enterReveal(mImg2);
				AnimationUtil.enterReveal(mImg3);
			}
		});

		mHideButton.setOnClickListener( new View.OnClickListener() {
			@Override
			public void onClick( View v ) {
				AnimationUtil.exitReveal( mImg1 );
				AnimationUtil.exitReveal( mImg2 );
				AnimationUtil.exitReveal( mImg3 );
			}
		} );

		// TODO: 1/4/16 add a start game dialog box
		mGame = Game.newGame();
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
