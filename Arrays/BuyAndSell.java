//22)Buy and sell at profits
//I: 1,5,3,8,12
//O:13
import java.util.*;
public class BuyAndSell
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
	    int maxProfit = 0;

        for (int i = 0; i < n-1; i++) {
            if (arr[i] < arr[i + 1]) {
                maxProfit += arr[i+1] - arr[i]; 
            }
        } System.out.println(maxProfit);
	}
}
