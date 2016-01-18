package mountaincat.dominion;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Path;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;

import mountaincat.dominion.ui.AnimationUtil;


public class DominionRoot extends FragmentActivity {

	private Game mGame;
	private View mCardView;
	private View mCardView2;
	private View mCardName;
	private View mMiscellaneous;
	private View mImg1;
	private View mImg2;
	private View mImg3;

	@Override
	protected void onCreate( Bundle savedInstanceState ) {
		// TODO: 1/14/16 clean up all the animation stuff
		super.onCreate( savedInstanceState );
		setContentView( R.layout.sample );
		mCardView = findViewById( R.id.card );
		mCardView2 = findViewById( R.id.card2 );
		mCardName = findViewById( R.id.cardName );
		mMiscellaneous = findViewById( R.id.miscellaneous );
		mImg1 = findViewById( R.id.img1 );
		mImg2 = findViewById( R.id.img2 );
		mImg3 = findViewById( R.id.img3 );

		mCardView.setOnClickListener( new View.OnClickListener() {
			@Override
			public void onClick( View v ) {
				Intent intent = new Intent( DominionRoot.this, SecondActivity.class );
				Pair<View, String> p1 = Pair.create( mCardName, "cardName" );
				Pair<View, String> p2 = Pair.create( mMiscellaneous, "miscellaneous" );

				ActivityOptionsCompat options =
						ActivityOptionsCompat.makeSceneTransitionAnimation( DominionRoot.this, p1, p2 );
				startActivity( intent, options.toBundle() );
			}
		} );

		// TODO: 1/4/16 add a start game dialog box
		mGame = Game.newGame();
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

	public void animate( View view ) {
		float scale = getResources().getDisplayMetrics().density;
		ObjectAnimator anim1 = ObjectAnimator.ofFloat( mCardView,
				"x", mCardView.getLeft(), ( mCardView.getLeft() + 200 ) * scale );
		anim1.setDuration( 1000 );
		ObjectAnimator anim2 = ObjectAnimator.ofFloat( mCardView,
				"y", mCardView.getTop(), ( mCardView.getTop() + 200 ) * scale );
		anim2.setDuration( 1000 );
		ObjectAnimator anim3 = ObjectAnimator.ofFloat( mCardView,
				"x", mCardView.getLeft(), ( mCardView.getLeft() - 200 ) * scale );
		anim3.setDuration( 1000 );
		ObjectAnimator anim4 = ObjectAnimator.ofFloat( mCardView,
				"y", mCardView.getTop(), ( mCardView.getTop() - 200 ) * scale );
		anim4.setInterpolator( new AccelerateInterpolator( 3 ) );
		anim4.setDuration( 1000 );
		AnimatorSet animSet = new AnimatorSet();
		animSet.play( anim1 ).before( anim2 );
		animSet.play( anim2 ).before( anim3 );
		animSet.play( anim3 ).with( anim4 );
		animSet.play( anim1 ).after( 500 );

		animSet.start();

	}

	public void moveArc( View view ) {
		float scale = mCardView.getResources().getDisplayMetrics().density;
		float left = mCardView.getLeft();
		float right = left + ( 200 * scale );
		float top = mCardView.getTop();
		float bottom = top + ( 200 * scale );
		Path path = new Path();

		path.reset();
		path.moveTo( left, top );
		path.quadTo( right, top, right, bottom );
		ObjectAnimator anim = ObjectAnimator.ofFloat( mCardView, "x", "y", path );
		anim.setDuration( 1000 );
		anim.start();
	}


	public void reveal( View view ) {
		AnimationUtil.enterReveal(mImg1);
		AnimationUtil.enterReveal( mImg2 );
		AnimationUtil.enterReveal( mImg3 );
	}

	public void hide( View view ) {
		AnimationUtil.exitReveal( mImg1 );
		AnimationUtil.exitReveal( mImg2 );
		AnimationUtil.exitReveal( mImg3 );
	}
}
