package ms.leetcode.PalindromeNumber;

public class PalindromeNumber {

  public static boolean isPalindrome(int x) {
    String input = String.valueOf(x);

    for (int i = 0; i < input.length(); i++) {
      if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
        return false;
      }
    }

    return true;
  }

  public static boolean isPalindrome2(int x) {
    int reversed = 0;
    int temporary = x;

    while (temporary > 0) {
      int modulo = temporary % 10;
      reversed = reversed * 10 + modulo;
      temporary /= 10;
    }

    return reversed == x;
  }
}