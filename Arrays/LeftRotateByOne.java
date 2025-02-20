//14)left rotate array by one
//i/p: 5, 1 2 3 4 5
//o/p: 2 3 4 5 1
import java.util.*;
public class LeftRotateByOne
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++){
		        int temp = arr[i+1];
		        arr[i+1]=arr[i];
		        arr[i]=temp;
		}
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
}
}
