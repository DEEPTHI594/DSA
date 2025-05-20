public class MinRecursion{

    public static int min(int[] arr, int i, int m) {
        if(i==arr.length-1){
           return m;
        }
        if(arr[i]<m){
            m=arr[i];
        }
        
        return min(arr,i+1,m);
    }
    
    public static void main(String[] args) {
       int[] arr = {3,2,1,4,5};
       
       
       int ans = min(arr,0,arr[0]);
       System.out.println(ans);
      
       
    }
}
