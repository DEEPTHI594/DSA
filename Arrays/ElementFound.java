//4)whether an element is found or not found
import java.util.*;
public class ElementFound
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
	}
	System.out.print("s:");
	int s = sc.nextInt();
	int flag=0;
	int l=0;
	int h=n-1;
	for(int i=0;i<n;i++){
	while(l<=h){
	int mid = (l+h)/2;
	if(arr[mid]==s){
	flag = 1;
	break;
}else if(arr[mid]>s){
    h = mid-1;
}else{
    l = mid+1;
}
}
}
if(flag==1){
System.out.print("found");
}else{
System.out.print("not found");
}
}
}
