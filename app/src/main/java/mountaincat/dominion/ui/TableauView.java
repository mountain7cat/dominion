package mountaincat.dominion.ui;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import mountaincat.dominion.R;
import mountaincat.dominion.Tableau;
import mountaincat.dominion.card.Card;

public class TableauView extends LinearLayout {

    private RecyclerView mPlayedCards;
    private RecyclerView mHand;
    private TextView mDeck;
    private TextView mTrash;

    private Tableau mTableau;

    public TableauView(Context context) {
        super(context);
    }

    public TableauView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TableauView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        mPlayedCards = (RecyclerView) findViewById(R.id.playedCards);
        mHand = (RecyclerView) findViewById(R.id.hand);
        mDeck = (TextView) findViewById(R.id.deck);
        mTrash = (TextView) findViewById(R.id.trash);

        mPlayedCards.setLayoutManager(new LinearLayoutManager(context));
        mPlayedCards.setAdapter(new CardListAdapter());
        mHand.setLayoutManager(new LinearLayoutManager(context));
        mHand.setAdapter(new CardListAdapter());
    }

    public void setTableau(Tableau tableau) {
        mTableau = tableau;
        setPlayedCards(tableau.getPlayed());
        setHand(tableau.getHand());
    }

    public void setPlayedCards(List<Card> playedCards) {
        CardListAdapter adapter = (CardListAdapter) mPlayedCards.getAdapter();
        adapter.addCards(playedCards);
    }

    public void setHand(List<Card> hand) {
        CardListAdapter adapter = (CardListAdapter) mHand.getAdapter();
        adapter.addCards(hand);
    }
}
