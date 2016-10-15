package mountaincat.dominion.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import mountaincat.dominion.card.Card;

public class CardView extends LinearLayout {

    private TextView mCardName;
    private TextView mCardText;

    public CardView(Context context) {
        super(context);
    }

    public CardView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void update(Card card) {
        mCardName.setText(card.getType().name());
        // TODO: 1/21/16 fill out cardText
        mCardText.setText("to be filled");
    }
}
