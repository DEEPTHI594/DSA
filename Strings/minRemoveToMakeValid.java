//17)Minimum Remove to make valid paranthesis Input: s = "lee(t(c)o)de)"
Output: "lee(t(c)o)de"     Input: s = "))(("     Output: ""
class Solution {
    public String minRemoveToMakeValid(String s) {
    int depth = 0;
    StringBuilder sb  = new StringBuilder();
    for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        if(c=='('){
            depth++;
            sb.append(c);
        }else if(c==')'){
            if(depth>0){
                depth--;
                sb.append(c);
            }
        }else{
            sb.append(c);
        }
    } 
    StringBuilder result = new StringBuilder();
    depth= 0;   
    for(int i=sb.length()-1;i>=0;i--){
        char c = sb.charAt(i);
        if(c==')'){
            result.append(c);
            depth++;
        }else if(c=='('){
            if(depth>0){
                depth--;
                result.append(c);
            }
        }else{
            result.append(c);
        }       
    }
    return result.reverse().toString();
    }
}
