//4)Buddy Strings i/p:”ab” “ba” o/p:true , i/p:”aa” “aa” o/p:true 
class BuddyString{
    public boolean buddyStrings(String s, String goal) {
      if(s.length()!=goal.length()){
        return false;
      } 
       if(s.equals(goal)){
            HashSet<Character> set = new HashSet<>();
            for(char c: s.toCharArray()){
                set.add(c);
       }
       if(set.size()==1){
            return true;
       }else{
            return false;
       }
      }

      ArrayList<Integer> al = new ArrayList<>();
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)!=goal.charAt(i)){
            al.add(i);
        }
      }
      if(al.size()==2 && 
      s.charAt(al.get(0))==goal.charAt(al.get(1)) &&
      goal.charAt(al.get(0))==s.charAt(al.get(1)) ) {
            return true;
      }else{
        return false;
      }
      
    }
}
