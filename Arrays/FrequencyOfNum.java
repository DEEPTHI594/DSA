//21)Frequency of num in a sorted array
import java.util.*;
public class FrequencyOfNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
	    int count=1;
	    for(int i=1;i<n;i++){
	        if(arr[i]==arr[i-1]){
	            count++;
	        }else{
	            System.out.println(arr[i-1]+" ->"+ count);
	            count=1;
	        }
	    }
	    System.out.println(arr[n-1]+"->"+count);
		
	}
}
//using hashmap
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }    } }
