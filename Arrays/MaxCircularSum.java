//28) Given an array of integers arr[] in a circular fashion. Find the maximum subarray sum //that we can get if we assume the array to be circular.
//Input: arr[] = [8, -8, 9, -9, 10, -11, 12]
//Output: 22
import java.util.*;

public class MaxCircularSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSum = arr[0], currMax = arr[0];
        int minSum = arr[0], currMin = arr[0];
        int totalSum = arr[0];
for (int i = 1; i < n; i++) {
            totalSum += arr[i];
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSum = Math.max(maxSum, currMax);
            currMin = Math.min(arr[i], currMin + arr[i]);
            minSum = Math.min(minSum, currMin);
        }
        int circularMax = totalSum == minSum ? maxSum : Math.max(maxSum, totalSum - minSum);

        System.out.println(circularMax);
    }
}
