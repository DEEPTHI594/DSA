//20)print odd number followed by even number
//i/p: 6, 100 110 96 101 103 105
//o/p:  101 110 103 100 105 96 
import java.util.*;
public class OddEvenPrint{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int eCount=0,oCount=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                eCount++;
            }else{
                oCount++;
            }
        }
        int[] oddArr = new int[oCount];
        int[] evenArr = new int[eCount];
        int o=0,e=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evenArr[e++]=arr[i];
            }else{
                oddArr[o++]=arr[i];
            }
        }
            if(oCount==n){
                System.out.print("only odd numbers");
                return;
            }
            if(eCount==n){
               System.out.print("only even numbers"); 
               return;
            }
            int i = 0, j = 0;
            while (i < oCount && j < eCount) {
            System.out.print(oddArr[i++] + " " + evenArr[j++] + " ");
        }        while (i < oCount) {
            System.out.print(oddArr[i++] + " ");
        }        while (j < eCount) {
            System.out.print(evenArr[j++] + " ");
        }
        }
}
