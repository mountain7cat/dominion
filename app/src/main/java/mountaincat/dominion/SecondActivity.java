package mountaincat.dominion;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class SecondActivity extends FragmentActivity {

	@Override
	protected void onCreate( Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_second );
	}

	@Override
	public void onBackPressed() {
		super.onBackPressed();
		supportFinishAfterTransition();
	}
}
