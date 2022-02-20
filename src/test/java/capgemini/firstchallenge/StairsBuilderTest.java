package capgemini.firstchallenge;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class StairsBuilderTest {

    @Test
    void shouldReturnsNumberOfLinesEqualsNumberOfStairs() {
        var numberOfStairs = 5;

        var numberOfLines = StairsBuilder.build(numberOfStairs).lines().count();

        assertThat(numberOfLines).isEqualTo(numberOfStairs);
    }

    @Test
    void shouldReturnTheSumOfTheAsterisksEqualsToTheSumTheNumberOfStairsDecrementedByOneUntilOne() {
        var numberOfStairs = 5;
        var theSumTheOfNumberOfStairsDecrementedByOneUntilOne = 5 + 4 + 3 + 2 + 1;

        var stairs = StairsBuilder.build(numberOfStairs);
        var sumOfTheAsterisks = StairsBuilder.sumAsterisk(stairs);

        assertThat(sumOfTheAsterisks).isEqualTo(theSumTheOfNumberOfStairsDecrementedByOneUntilOne);
    }

    @Test
    void shouldNotHaveBlankLineInTheLastLine() {
        var numberOfStairs = 5;

        var stairs = StairsBuilder.build(numberOfStairs);
        var lastLine = stairs.lines().collect(Collectors.toList()).get(numberOfStairs - 1);

        assertThat(lastLine).isNotBlank();
    }
}