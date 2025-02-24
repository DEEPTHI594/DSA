//29)Minimum number of flips required to have same grps in an array
//i/p:1,1,0,0,0,1
//o/p: from 2 to 5
import java.util.*;

public class MinFlips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int countOne = 0, countZero = 0;
        if (arr[0] == 1) countOne++;
        else countZero++;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] == 1) {
                    countOne++;
                } else {
                    countZero++;
                }
            }
        }
        int target = (countZero < countOne) ? 0 : 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) { 
                if (arr[i] == target) {
                    System.out.print("From " + i + " ");
                } else {
                    System.out.println("to " + (i - 1));
                }
            }
        }
        if (arr[n - 1] == target) {
            System.out.println("to " + (n - 1));
        }
    }
}
