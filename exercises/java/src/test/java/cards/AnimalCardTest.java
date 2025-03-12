package cards;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class AnimalCardTest {

    @Test
    public void snapShouldReturnTrue_whenCardsAreEqual() {
        // given
        AnimalCard cardOne = new AnimalCard(Animal.AARDVARK);
        AnimalCard cardTwo = new AnimalCard(Animal.AARDVARK);

        // when
        boolean result = cardOne.snap(cardTwo);

        // then
        assertThat(result).isTrue();
    }

    @Test
    public void snapShouldReturnFalse_whenCardsAreNotEqual() {
        // given
        AnimalCard cardOne = new AnimalCard(Animal.AARDVARK);
        AnimalCard cardTwo = new AnimalCard(Animal.BABOON);

        // when
        boolean result = cardOne.snap(cardTwo);

        // then
        assertThat(result).isFalse();
    }

}