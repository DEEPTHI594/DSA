//10) Given two numbers N and K, write a program to print the K th largest factor of the //given number N.
import java.util.*;
public class KFactors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
       ArrayList<Integer> al = new ArrayList<>();
       for(int i=1;i<=n;i++){
           if(n%i==0){
               al.add(i);
           }
       }
       System.out.println(al.get(al.size()-k));
    }
}
