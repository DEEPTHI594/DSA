//18) in1: 6
//in2: 77 123 24 255 220 92
//op:  0 6 1 50 1 1
//Note 1. if the number is odd do check if the product of that individual number is odd //print "0" else print the product of that individual number.
//2. if the number is even Simply print "1"
import java.util.*;
public class ProductEvenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.print(1+" ");
            }else{
                int m = arr[i];
                int p=1;
                while(m!=0){
                int rem = m%10;
                p=p*rem;
                m=m/10;
                }
                if(p%2==0){
                    System.out.print(p+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
        }
    }
}
