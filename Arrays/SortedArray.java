//8)check if array is sorted or not
//O(n2)
import java.util.*;
public class SortedArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int flag = 1;
		for(int i=0;i<n;i++){
		    for(int j = i+1;j<n;j++){
		        if(arr[i]>arr[j]){
		           flag=0;
		           break;
		        }
		    }
		}
		if(flag==1){
		    System.out.println("true");
		}else{
		    System.out.println("false");
		}
	}
}
//O(n)
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int flag = 1;
		for(int i=0;i<n-1;i++){
		        if(arr[i]>arr[i+1]){
		           flag=0;
		           break;
		        }
		    }
		if(flag==1){
		    System.out.println("true");
		}else{
		    System.out.println("false");
		}
	}
}
