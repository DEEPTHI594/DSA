//4)Sum of n numbers.
public class sumRecursion
{
    public static void sumOfNum(int i, int n,int sum){
       if(i==n){
           sum+=i;
           System.out.println(sum);
           return;
       }
       sum+=i;
       sumOfNum(i+1,n,sum);
    }
	public static void main(String[] args) {
	    sumOfNum(1,5,0);
	}
}
