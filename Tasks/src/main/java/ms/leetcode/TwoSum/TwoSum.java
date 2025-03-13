package ms.leetcode.TwoSum;

import java.util.HashMap;

public class TwoSum {

  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    int length = nums.length;

    for (int i = 0; i < length; i++) {
      int remainder = target - nums[i];
      if (hashMap.containsKey(remainder)) {
        return new int[] {hashMap.get(remainder), i};
      }

      hashMap.put(nums[i], i);
    }

    return new int[]{};
  }
}