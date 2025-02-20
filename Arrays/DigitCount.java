6)digit count of each element in array
N=3; arr: 1, 66,999
o/p: 1 2 3

import java.util.*;
public class DigitCount
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
	int count = 0;
	for(int i=0;i<n;i++){
	int m = arr[i];
	while(m!=0){
	    int q = m%10;
	    m=m/10;
	count++;
}
System.out.println(count);
}
}
