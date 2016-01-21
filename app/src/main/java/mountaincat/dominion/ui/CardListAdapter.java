package mountaincat.dominion.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import mountaincat.dominion.R;
import mountaincat.dominion.card.Card;

/**
 * Created on 1/20/16.
 */
public class CardListAdapter extends RecyclerView.Adapter<CardListAdapter.CardViewHolder> {

    private final List<Card> mCards = new ArrayList<>();

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CardViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent));
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        holder.bind(mCards.get(position));
    }

    public void addCards(List<Card> cards) {
        mCards.addAll(cards);
        notifyDataSetChanged();
    }

    public void addCard(Card card) {
        mCards.add(card);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mCards.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        private final CardView mCardView;
        private final TextView mCardName;
        private final TextView mCardText;

        public CardViewHolder(View itemView) {
            super(itemView);
            mCardView = (CardView) itemView;
            mCardName = (TextView) itemView.findViewById(R.id.cardName);
            mCardText = (TextView) itemView.findViewById(R.id.cardText);
        }

        public void bind(Card card) {
            mCardName.setText(card.getType().name());
            // TODO: 1/21/16 fill out cardText
            mCardText.setText("to be filled");
        }
    }
}
