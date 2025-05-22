//7)Remove outermost parenthesis     Input: s = "(()())(())"      Output: "()()()"

class outParenthesis {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int depth=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                if(depth>0){
                    sb.append(ch);
                }depth++;
            }else if(ch==')'){
                depth--;
                if(depth>0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
