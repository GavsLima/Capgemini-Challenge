package capgemini.thirdchallenge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class AnagramFinderTest {

    @Test
    void shouldReturnTwoToWordOvo() {
        var numberOfAnagrams = AnagramFinder.findAnagrams("ovo");

        assertThat(numberOfAnagrams).isEqualTo(2);
    }

    @Test
    void shouldReturnThreeToWordIfailuhkqq() {
        var numberOfAnagrams = AnagramFinder.findAnagrams("ifailuhkqq");

        assertThat(numberOfAnagrams).isEqualTo(3);
    }
}