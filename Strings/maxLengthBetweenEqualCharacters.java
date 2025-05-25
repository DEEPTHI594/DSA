//15)Longest length bw equal  Input: s = "aa"Output: 0 Input: s = "abca"
//Output: 2  Input: s = "cbzxy"  Output: -1
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
    int left =0, right=s.length()-1;
    while(left<right){
        if(s.charAt(left)==s.charAt(right)){
            return right-1;
        }
        left++;
        right--;
    }
    return -1;
    }
}
(or)***********
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
     HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int firstIndex = map.get(c);
                maxLen = Math.max(maxLen, i - firstIndex - 1);
            } else {
                map.put(c, i);
            }
        }

        return maxLen;    
    }
}
