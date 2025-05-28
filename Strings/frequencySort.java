//20)Sort Characters by Frequency Input: s = "tree" Output: "eert"
class Solution {
    public String frequencySort(String s) {
    HashMap<Character,Integer> map = new HashMap<>();
    for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
    }
    List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
    list.sort((a,b) -> b.getValue()-a.getValue());
    StringBuilder sb = new StringBuilder();
    for(Map.Entry<Character,Integer> entry:list){
        char key = entry.getKey();
        int value = entry.getValue();
        for(int i=0;i<value;i++){
            sb.append(key);
        }
    }
    return sb.toString();   
    }
}
