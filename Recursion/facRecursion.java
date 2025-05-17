//5)Factorial of n numbers.
public class facRecursion
{
    public static void facOfNum(int i, int n,int fac){
       if(i==n){
           fac=fac*i;
           System.out.println(fac);
           return;
       }
       fac=fac*i;
       facOfNum(i+1,n,fac);
    }
	public static void main(String[] args) {
	    facOfNum(1,5,1);
	}
}
