//9)Prime or not
public class primeRecur {

    public static boolean isPrime(int i, int n) {
        
        if (n % i == 0) {
            return false; // Found a divisor
        }
        if (i*i>n) {
            return true; // No divisors found till sqrt(n)
        }
        return isPrime(i + 1, n); // Check next number
    }

    public static void main(String[] args) {
        int n = 7;
        if (isPrime(2, n)) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }
}
