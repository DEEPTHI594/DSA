//13)valid palindrome-2 
//Input: s = "abca" Output: true Explanation: You could delete the character 'c'.
//Input: s = "abc"   Output: false
class Solution {
    public boolean validPalindrome(String s) {
    int first=0;
    if(s.charAt(0)!=s.charAt(s.length()-1)){
            return false;
        }
    for(int i=0;i<s.length();i++){
        
        if(s.charAt(i)==s.charAt(s.length()-i-1)){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            if(first==0){
                first=i;
                
            }else{
                return false;
            }
        }
    } 
    return false; 

    }
}
(or)
class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // If there's a mismatch, try skipping either the left or right character
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true; // It's already a palindrome
    }

    // Helper function to check if a substring is a palindrome
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
