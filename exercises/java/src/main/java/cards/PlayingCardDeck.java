package cards;

import java.util.ArrayList;

public class PlayingCardDeck extends Deck {

    public PlayingCardDeck() {
        this.cards = new ArrayList<>(52);

        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                int index = suit * 13 + faceValue;
                this.cards.add(index, new PlayingCard(new Suit(suit), faceValue));
            }
        }
    }

    @Override
    public String[] getCards() {
        String[] result = new String[cards.size()];
        for (int i = 0; i < cards.size(); i++) {
            Card card = cards.get(i);
            result[i] = card.toString();
        }
        return result;
    }
}
