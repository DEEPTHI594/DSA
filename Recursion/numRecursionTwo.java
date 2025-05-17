//2)Print 1 to 5 numbers.
public class numRecursionTwo
{
    public static void printNum(int n){
        if(n==6){
            return;
        }
        
        System.out.println(n);
        printNum(n+1);
        
    }
	public static void main(String[] args) {
	
		printNum(1);
	}
}
