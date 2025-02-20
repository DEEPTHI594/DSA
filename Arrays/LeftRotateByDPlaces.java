//15)left rotate array by d places
//i/p: 5, 2, 1 2 3 4 5
//o/p:  3 4 5 1 2
//notes: if d=n,  rotation will give same array, so d= d%n checks the no of times of rotation //req.
import java.util.*;
public class LeftRotateByDPlaces
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n:");
		int n = sc.nextInt();
		System.out.println("d:");
		int d = sc.nextInt();
		int[] arr = new int[n];
		int i;
		for(i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		d = d%n;
		    for(i=0;i<d;i++){
		        int temp = arr[0];
		        for(int j=0;j<n-1;j++){
		            arr[j]=arr[j+1];
		
		}
		        arr[n-1]=temp;
}
		
		for(i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
}
}