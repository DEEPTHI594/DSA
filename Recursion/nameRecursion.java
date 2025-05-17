//3)Print name upto n times.
public class nameRecursion
{
    public static void printName(int i, int n){
        if(i==n){
            return;
        }
        System.out.println("Raj");
        printName(i+1,n);
    }
	public static void main(String[] args) {
	    printName(1,5);
	}
}
