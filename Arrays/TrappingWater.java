//23)Trapping water
//i/p:2,0,2
//o/p:2
//i/p:3,0,1,2,5
//o/p:5
import java.util.*;
public class TrappingWater
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
	    int initial = arr[0];
	    int diff=0;
	    for(int i=1;i<n;i++){
	        if(initial>arr[i]){
	            
	            diff=diff+(initial-arr[i]) ;
	            
	        }
	    }
	    System.out.println(diff);
	}
}
