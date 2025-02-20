//2)find second max in an array
import java.util.*;
public class SecMax
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
	}
	int max = arr[0];
	int secondMax = arr[1];
	for(int i=0;i<n;i++){
	if(arr[i]<max && arr[i]>secondMax){
	secondMax = arr[i];
}
}
System.out.print(secondMax);
}
}
