//19) Write a java program to reverse Array in a halfway?
//input1: 6
//input2:  1 8 10 9 20 11
//output : 10 8 1  11 29 9
import java.util.*;
public class ArrayHalfReverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }if(n>2){
        int m = n/2;
        for(int i=0;i<m/2;i++){
            int temp = arr[i];
            arr[i]=arr[m-i-1];
            arr[m-i-1]=temp;
        }
        for (int i = m, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
        }else{
            for(int i=n-1;i>=0;i--){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
