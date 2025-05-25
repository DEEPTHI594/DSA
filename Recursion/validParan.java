//1)Valid parenthesis    i/p:{()} o/p:true
class 
 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                 stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(ch==')' && top!='(' || ch=='}' && top!='{' || ch==']' && top!='['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
(or)
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(')');
            }else if(ch=='{'){
                st.push('}');
            }else if(ch=='['){
                st.push(']');
            }else if(st.isEmpty()||st.pop()!=ch){
                return false;
            }
            
        }
        return st.isEmpty();
    }
}
