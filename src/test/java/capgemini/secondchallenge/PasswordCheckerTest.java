package capgemini.secondchallenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class PasswordCheckerTest {

    private PasswordChecker checker;

    @BeforeEach()
    void setUp() {
        checker = new PasswordChecker();
    }

    @Test
    @DisplayName("Should return zero to the missing chars of the password abcD1@ ")
    void shouldReturnZero() {
        var missingChar = checker.check("abcD1@");

        assertThat(missingChar).isEqualTo(0);
    }

    @Test
    @DisplayName("Should return one to the missing chars of the  password abcdE1 ")
    void shouldReturnOne() {
        var missingChar = checker.check("abcdE1");

        assertThat(missingChar).isEqualTo(1);
    }

    @Test
    @DisplayName("Should return two to the missing chars of the  password abcde1 ")
    void shouldReturnTwo() {
        var missingChar = checker.check("abcde1");

        assertThat(missingChar).isEqualTo(2);
    }

    @Test
    @DisplayName("Should return three to the missing chars of the  password abcdef ")
    void shouldReturnThree() {
        var missingChar = checker.check("abcdef");

        assertThat(missingChar).isEqualTo(3);
    }

    @Test
    @DisplayName("Should return four to the missing chars of the  password 12 ")
    void shouldReturnFour() {
        var missingChar = checker.check("12");

        assertThat(missingChar).isEqualTo(4);
    }
}