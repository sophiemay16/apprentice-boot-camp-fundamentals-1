package cards;

import java.util.Collections;
import java.util.List;

public interface Deck {

    default void shuffle() {
        Collections.shuffle(getListOfCards());
    }

    Card deal();

    String[] getCards();

    List<? extends Card> getListOfCards();
}
