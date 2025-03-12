package cards;

import java.util.Collections;
import java.util.List;

public abstract class Deck {

    protected List<Card> cards;

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card deal() {
        return cards.remove(0);
    }

    abstract String[] getCards();
}
