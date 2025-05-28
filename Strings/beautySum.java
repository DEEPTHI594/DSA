//22)sum of beauty of all substrings   Input: s = "aabcb"   Output: 5
Explanation: The substrings with non-zero beauty are ["aab","aabc","aabcb","abcb","bcb"], each with beauty equal to 1.

class Solution {
    public int beautySum(String s) {
        int totalBeauty = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int[] freq = new int[128]; // ASCII size
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                freq[c]++;

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                for (int k = 'a'; k <= 'z'; k++) {
                    if (freq[k] > 0) {
                        maxFreq = Math.max(maxFreq, freq[k]);
                        minFreq = Math.min(minFreq, freq[k]);
                    }
                }

                totalBeauty += (maxFreq - minFreq);
            }
        }

        return totalBeauty;
    }
}
