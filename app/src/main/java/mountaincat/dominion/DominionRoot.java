package mountaincat.dominion;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;

import mountaincat.dominion.ui.TableauView;


public class DominionRoot extends FragmentActivity {

    private Game mGame;
    private TableauView mTableauView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dominion_root);
        // TODO: 1/4/16 add a start game dialog box
        mTableauView = (TableauView) findViewById(R.id.tableauView);
        mGame = Game.newGame();
        mGame.start();
        mTableauView.setTableau(mGame.getCurrentPlayer().getTableau());
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
