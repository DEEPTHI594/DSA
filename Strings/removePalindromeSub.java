//14)Remove palindromic sequences Input: s = "ababa"   Output: 1
// Input: s = "abb"  Output: 2
class Solution {
    public int removePalindromeSub(String s) {
        if (isPalindrome(s)) {
            return 1; 
        }
        return 2; 
    }

    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
