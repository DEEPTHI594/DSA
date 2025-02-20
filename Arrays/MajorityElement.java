//27)Majority element in an array
//i/p:8,2,3,8,8                o/p:0 or 3 or 4(return any index of majority element)
//i/p:2,7,4,7,7,5             o/p: -1(for majority count>n/2)
import java.util.*;
public class MajorityElement
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
	    
	    int max=arr[0];
	    int count=0;
	    int m=0;
	    for(int i=0;i<n;i++){
	        if(arr[i]>max){
	            m++;
	            max=arr[i];
	           
	            break;
	        }
	    }
	    for(int i=0;i<n;i++){
	        if(arr[i]==max){
	            count++;
	        }
	    }
	    if(count>n/2){
	    System.out.println(m);
	    }else{
	        System.out.print(-1);}}}
