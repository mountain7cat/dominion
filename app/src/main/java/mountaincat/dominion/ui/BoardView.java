package mountaincat.dominion.ui;

import mountaincat.dominion.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class BoardView extends LinearLayout {

	public BoardView( Context context ) {
		super( context );
		LayoutInflater.from( getContext() ).inflate( R.layout.board_view, this, true );
	}

}
