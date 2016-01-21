package mountaincat.dominion;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Path;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.Pair;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;

import mountaincat.dominion.ui.AnimationUtil;
import mountaincat.dominion.ui.CardListAdapter;


public class DominionRoot extends FragmentActivity {

    private Game mGame;
    private RecyclerView mHandView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO: 1/14/16 clean up all the animation stuff
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dominion_root);
        mHandView = (RecyclerView) findViewById(R.id.handView);
        mHandView.setLayoutManager(new LinearLayoutManager(this));
        mHandView.setAdapter(new CardListAdapter());
        // TODO: 1/4/16 add a start game dialog box
        mGame = Game.newGame();
        mGame.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dominion_root, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
