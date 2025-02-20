//24)Consecutive 1s
//I/p :0,1,1,0,1,0      o/p:2
//I/p:1,1,1,1              o/p:4
//i/p:0,0,0                  o/p:0
import java.util.*;
public class ConsecutiveOnes
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
	    
	    int count=1;
	    int flag = 0;
	    for(int i=0;i<n-1;i++){
	        if(arr[i]==arr[i+1] && arr[i]==1){
	            flag=1;
	            count++;
	        }
	    }
	    if(flag==1){
	    System.out.println(count);
	    }
	    else{
	        System.out.println(0);}}}
