package ms.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


public class TwoSumTest {


  @Test
  void testTwoSumMethod() {
    int[] nums = new int[]{2, 7, 11, 15};
    int target = 9;
    int[] expected = new int[]{0, 1};

    int[] result = TwoSum.twoSum(nums, target);

    assertThat(result)
        .isNotEmpty()
        .isEqualTo(expected);
  }
}