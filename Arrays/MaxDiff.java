//17)Max diff with order
//i/p: 7,9,5,6,3,2
//o/p:2
import java.util.*;
public class MaxDiff
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int i,j,k;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(i=0;i<n;i++){
		    if(arr[i]>max){
		        max=arr[i];
		    }
		}
		for(j=0;j<n;j++){
		    if(arr[j]<min){
		        min = arr[j];
		    }
		}
		if(i>j){
		    int diff = max-min;
		    System.out.println(diff);
		}else{
		    System.out.println(min);
		}
}
}
