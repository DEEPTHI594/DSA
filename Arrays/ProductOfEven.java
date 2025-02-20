//5)if even digits are there in an array , find the product of those even digits
import java.util.*;
public class ProductOfEven
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
	int flag=0;
	for(int i=0;i<n;i++){
	int p = 1;
	if(arr[i]%2==0){
	flag = 1;
	while(n!=0){
	    int num = arr[i]%10;
	    p = p*num;
	    n= n/10;
}
System.out.println(p);
}
}
if(flag==0){
System.out.println("no even number");
}
}
}
