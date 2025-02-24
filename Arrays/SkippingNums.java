//31) Create a Java program to print numbers between 1 to n, skipping numbers which //are divisible by k.
//Input:- 8 3 
//Output:- 1 2 4 5 7 8
import java.util.*;
public class SkippingNums{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%k!=0){
                System.out.print(i+" ");                
            }else{
                continue;
            }
        }
    }
}
