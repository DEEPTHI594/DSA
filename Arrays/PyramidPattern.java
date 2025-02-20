//11) Given two numbers S and N write a program to print a Pyramid of N rows using numbers starting from S.
//Test case 1	7 5	    7
   7 8
  7 8 9
 7 8 9 10
7 8 9 10 11
import java.util.*;
public class PyramidPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
         for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((s + j) + " ");
            }
            System.out.println(); 
        }
    }
}
