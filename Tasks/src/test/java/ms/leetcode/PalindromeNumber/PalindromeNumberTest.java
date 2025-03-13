package ms.leetcode.PalindromeNumber;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PalindromeNumberTest {

  @ParameterizedTest
  @MethodSource("positiveResults")
  void shouldPassWithPositiveResultsForTypeOne(Integer input) {
    boolean result = PalindromeNumber.isPalindrome(input);

    assertThat(result)
        .isTrue();
  }

  @ParameterizedTest
  @MethodSource("negativeResults")
  void shouldPassWithNegativeResultsForTypeOne(Integer input) {
    boolean result = PalindromeNumber.isPalindrome(input);

    assertThat(result)
        .isFalse();
  }

  @ParameterizedTest
  @MethodSource("positiveResults")
  void shouldPassWithPositiveResultsForTypeTwo(Integer input) {
    boolean result = PalindromeNumber.isPalindrome2(input);

    assertThat(result)
        .isTrue();
  }

  @ParameterizedTest
  @MethodSource("negativeResults")
  void shouldPassWithNegativeResultsForTypeTwo(Integer input) {
    boolean result = PalindromeNumber.isPalindrome2(input);

    assertThat(result)
        .isFalse();
  }

  private static Stream<Integer> positiveResults() {
    return Stream.of(
        121,
        93339,
        12122121
    );
  }

  private static Stream<Integer> negativeResults() {
    return Stream.of(
        -121,
        10,
        99998
    );
  }
}