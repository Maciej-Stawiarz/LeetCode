package ms.leetcode.TwoSum;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TwoSumTest {

  @ParameterizedTest
  @MethodSource("positiveResults")
  void shouldPassWithPositiveResults(List<Object> parameters) {
    int[] result = TwoSum
        .twoSum(
            (int[]) parameters.get(0),
            (Integer) parameters.get(1));

    assertThat(result)
        .isNotEmpty()
        .isEqualTo(parameters.get(2));
  }

  @ParameterizedTest
  @MethodSource("negativeResults")
  void shouldPassWithNegativeResults(List<Object> parameters) {
    int[] result = TwoSum
        .twoSum(
            (int[]) parameters.get(0),
            (Integer) parameters.get(1));

    assertThat(result)
        .isEmpty();
  }

  private static Stream<List<Object>> positiveResults() {
    return Stream.of(
        List.of(
            new int[]{2, 7, 11, 15},
            9,
            new int[]{0, 1}),
        List.of(
            new int[]{3, 2, 4},
            6,
            new int[]{1, 2}),
        List.of(
            new int[]{3, 3},
            6,
            new int[]{0, 1})
    );
  }

  private static Stream<List<Object>> negativeResults() {
    return Stream.of(
        List.of(
            new int[]{10, 10, 10},
            15,
            new int[]{}),
        List.of(
            new int[]{3},
            6,
            new int[]{}),
        List.of(
            new int[]{1, 1},
            6,
            new int[]{})
    );
  }
}