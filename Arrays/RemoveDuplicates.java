//12)remove duplicate elements from an array.
//i/p: 5 , 1 1 2 2 3
//o/p: [1,2,3]
import java.util.*;
public class RemoveDuplicates
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Integer> num = new HashSet<>();
		for(int i=0;i<n;i++){
		    num.add(sc.nextInt());
		}
	    
	        System.out.print(num + " ");
	    
}
}
