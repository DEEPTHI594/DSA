//35)EQUILIBRIUM POINT
import java.util.*;

public class EquilibriumPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum -= arr[i];  

            if (leftSum == totalSum) {  
                System.out.println("Equilibrium Index: " + i);
                return;
            }

            leftSum += arr[i];  
        }

        System.out.println("No Equilibrium Index Found");
    }
}
