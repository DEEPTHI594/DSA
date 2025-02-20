//7)mean and median
import java.util.*;
public class MeanMedian
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("n:");
	int n = sc.nextInt();
	System.out.println("arr elements:");
	int[] arr = new int[n];
	for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	int mean=0;
	int median=0;
	int sum=0;
	int mid;
	for(int i =0;i<n;i++){
	 sum = sum+arr[i];
	 mean = sum/n;
	 if(n%2!=0){
	 mid = n/2;
	 }else{
	 mid=(n+1)/2;
	 }
	 median = arr[mid];
	 }
	 System.out.print(mean);
	 System.out.print(median);
	
}
}
