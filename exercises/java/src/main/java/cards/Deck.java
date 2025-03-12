package cards;

import java.util.Collections;
import java.util.List;

public abstract class Deck {

    public void shuffle() {
        Collections.shuffle(getListOfCards());
    }

    abstract Card deal();

    abstract String[] getCards();

    abstract List<? extends Card> getListOfCards();
}
