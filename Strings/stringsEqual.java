//9)Check if two array strings are equal   word1 =["abc", "d", "defg"]
//word2 =["abcddefg"]     Output:true
//Input: word1 = ["ab", "c"], word2 = ["a", "bc"]     Output: true


class stringsEqual{
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String w : word1) {z
            sb1.append(w);
        }

        for (String w : word2) {
            sb2.append(w);
        }

        return sb1.toString().equals(sb2.toString());
    }
}
