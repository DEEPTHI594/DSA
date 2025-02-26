//33)Check if the sum exists in the array or not
//i/p: 1,4,20,3,10,5 sum:33 o/p:yes
import java.util.*;
public class SumExistsInArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int sum = sc.nextInt();
		int curr;
		int flag=0;
		for(int i=0;i<n;i++){
		    curr=0;
		    for(int j =i;j<n;j++){
		        curr+=arr[j];
		        if(curr==sum){
		            flag=1;
		    }
		}
		}
		if(flag==1){
		    System.out.println("yes");
		}else{
		    System.out.println("no");
		}
	}
}
(or)
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int sum = sc.nextInt();
		int s=0;
		int curr=0;
		int flag=0;
		for(int i=0;i<n;i++){
		    curr+=arr[i];
		    while(sum<curr){
		        curr-=arr[s];
		        s++;
		        if(curr==sum){
		            flag=1;
		        }
		    }
		}
		if(flag==1){
		    System.out.println("yes");
		}else{
		    System.out.println("no");
		}
	}
}
