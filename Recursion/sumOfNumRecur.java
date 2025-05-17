//10)Sum of numbers
public class sumOfNumRecur {

    public static int sumOfNum(int n) {
        if(n==0){
            return 0;
        }
       return (n%10)+sumOfNum(n/10);
       }
    public static void main(String[] args) {
        int ans = sumOfNum(13);
        System.out.println(ans);
       
    }
}
