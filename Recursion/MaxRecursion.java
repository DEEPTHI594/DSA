public class MaxRecursion{

    public static int max(int[] arr, int i,int m) {
        if(i==arr.length){
           return m;
        }
        if(arr[i]>m){
            m=arr[i];
        }
        
        return max(arr,i+1,m);
    }
    
    public static void main(String[] args) {
       int[] arr = {1,2,3,50,6,7,8};
       int ans = max(arr,0,arr[0]);
       System.out.println(ans);
       
    }
}
