import java.util.Scanner;
import java.math.BigInteger;

public class LCMCalculator {
   
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    
    private static BigInteger lcm(long a, long b) {
        long gcdValue = gcd(a, b);
      
        BigInteger A = BigInteger.valueOf(a);
        BigInteger B = BigInteger.valueOf(b);
        return (A.multiply(B)).divide(BigInteger.valueOf(gcdValue));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long M = sc.nextLong();

        System.out.println(lcm(N, M));
        
        sc.close();
    }
}
