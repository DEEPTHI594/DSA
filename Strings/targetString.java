//10)Check if words summation of two is equal to the target Input: firstWord = "acb", 
//secondWord = "cba", targetWord = "cdb"     Output: true
class targetString {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int val1=0,val2=0,val3=0;
        for(char ch:firstWord.toCharArray()){
            val1= val1*10+(ch -'a');
        }
        for(char ch:secondWord.toCharArray()){
            val2= val2*10+(ch -'a');
        }
        for(char ch:targetWord.toCharArray()){
            val3= val3*10+(ch -'a');
        }
        return val1+val2==val3;
    }
}
