//6)Fibbonacci of n numbers.
public class fibRecursion
{
    public static void fibbb(int a,int b, int n){
       if(n==0){
         return; 
       }
       int c=a+b;
       System.out.println(c);
       fibbb(b,c,n-1);
       
    }
	public static void main(String[] args) {
	    int a = 0;
	    int b = 1;
	    int n = 7;
	    System.out.println(a);
	    System.out.println(b);
	    fibbb(a,b,n-2);
	}
}
