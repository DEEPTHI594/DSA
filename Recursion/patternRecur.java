8)Given a number n, print the following pattern without using any loop.(n, n-5, n-10, ..., 0, 5, 10, ..., n+5, n)
Input: n = 16     Output: 16, 11, 6, 1, -4, 1, 6, 11, 16
Input: n = 10       Output: 10, 5, 0, 5, 10
public class patternRecur
{   
    public static void pattern(int n, int curr,boolean dec){
        System.out.println(curr);
        if (curr<= 0) {
            dec = false;
        }
        
        if(curr==n && !dec){
            return;
        }
        
        if(dec){
            pattern(n,curr-5,true);
        }else{
            pattern(n,curr+5,false);
        }
    }
	public static void main(String[] args) {
		pattern(16,16,true);
	}
}
