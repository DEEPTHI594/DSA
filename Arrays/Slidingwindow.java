//30)maximum sum of k elements(sliding window technique)
//i/p: 1,8,30,-5,20,7
//o/p:45
import java.util.*;

public class Slidingwindow{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int windowSum = 0, maxSum = 0;

        // Compute sum of first k elements
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;

        // Slide the window
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k]; // Remove first element, add new element
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println(maxSum);
    }
}
