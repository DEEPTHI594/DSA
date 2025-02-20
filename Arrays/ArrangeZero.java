//13)arranges 0’s to end
//i/p:5, 1 0  2 3 0
//o/p: 1 2 3 0 0
import java.util.*;
public class ArrangeZero
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++){
		    if(arr[i]==0){
		        int temp = arr[i];
		        arr[i]=arr[i+1];
		        arr[i+1]=temp;
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
}
}
