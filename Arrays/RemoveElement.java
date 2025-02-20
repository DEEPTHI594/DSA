//10)remove element from array
import java.util.*;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int removeElement = sc.nextInt(); 
        list.remove(Integer.valueOf(removeElement)); 
        System.out.println("Array after removal: " + list);
    }
}
