public class linearSearch{

    public static boolean search(int[] arr, int i, int s) {
        if(i==arr.length-1){
            return false;
        }
        
        if(arr[i] == s){
            return true;
        }
        return search(arr,i+1,s);
       }
    
    
    public static void main(String[] args) {
       int[] arr = {1,2,3,7,5};
       
       if(search(arr,0,9)){
           System.out.println("true");
       }else{
           System.out.println("false");
       }
       
    }
}
