package cards;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayingCardDeckTest {

    @Test
    public void snapShouldReturnTrue_whenCardsAreEqual() {
        // given
        PlayingCard cardOne = new PlayingCard(new Suit(1), 1);
        PlayingCard cardTwo = new PlayingCard(new Suit(1), 1);

        // when
        boolean result = cardOne.snap(cardTwo);

        // then
        assertThat(result).isTrue();
    }

    @Test
    public void snapShouldReturnFalse_whenCardsAreNotEqual() {
        // given
        PlayingCard cardOne = new PlayingCard(new Suit(1), 1);
        PlayingCard cardTwo = new PlayingCard(new Suit(2), 2);

        // when
        boolean result = cardOne.snap(cardTwo);

        // then
        assertThat(result).isFalse();
    }

}