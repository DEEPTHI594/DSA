//26)Longest even odd subarray
//i/p:10,12,14,7,8          o/p:3
import java.util.*;
public class LengthOfEvenOddArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
int count=1;
	    for(int i=0;i<n-1;i++){
	        if((arr[i] % 2 == 0 && arr[i + 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i + 1] % 2 == 0) ){
                count++;}}
	    System.out.println(count);}}
