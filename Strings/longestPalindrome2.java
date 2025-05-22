//12)Longest Palindrome Input: s = "abccccdd"   Output: 7
class Solution {
    public int longestPalindrome2(String s) {
        int[] freq = new int[128];
    for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        int length = 0;
        boolean hasOdd = false;

        for (int count : freq) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOdd = true;
            }
        }

        return hasOdd ? length + 1 : length;  
    }
}
