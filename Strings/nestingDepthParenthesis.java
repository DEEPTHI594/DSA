//8)Maximum nesting depth of parenthesis   Input: s = "(1+(2*3)+((8)/4))+1"
//Output: 3

class  nestingDepthParenthesis{
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;   
        for(char ch:s.toCharArray()){
            if(ch=='('){
                depth++;
                maxDepth=Math.max(depth,maxDepth);
            }
            if(ch==')'){
                depth--;
            }
        }
        return maxDepth;
    }
}
