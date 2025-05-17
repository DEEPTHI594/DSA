//7)Power x^n.
public class powRecursion
{   
    public static int power(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
	public static void main(String[] args) {
		int ans = power(2,5);
		System.out.print(ans);
	}
}

