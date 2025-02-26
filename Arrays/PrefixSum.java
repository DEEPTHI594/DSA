//34)Prefix sum
//i/p:2,3,5,4,6,1  sum(0,2)         o/p:23 
import java.util.*;
public class PrefixSum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++){
		    sum+=(i+1)*arr[i];
		}
		System.out.print(sum);
	}
}
