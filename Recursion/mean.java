public class mean{

    public static void mean(int[] arr, int i, int sum) {
        if(i==arr.length-1){
            sum+=arr[i];
            int n = arr.length;
            System.out.println(sum/n);
            return;
        }
        
        sum+=arr[i];
        mean(arr,i+1,sum);
    }
    
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};
       mean(arr,0,0);
      
       
    }
}
