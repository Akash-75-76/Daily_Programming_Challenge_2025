import java.util.*;

public class PrimeFactorization {

    public static List<Integer> primeFactorization(long N) {
        List<Integer> factors = new ArrayList<>();

        // Handle 2 separately for efficiency
        while (N % 2 == 0) {
            factors.add(2);
            N /= 2;
        }

        
        for (int i = 3; i * (long) i <= N; i += 2) {
            while (N % i == 0) {
                factors.add(i);
                N /= i;
            }
        }

        if (N > 2) {
            factors.add((int) N);
        }

        return factors;
    }

    public static void main(String[] args) {
       
        long[] testCases = {18, 30, 49, 19, 64, 123456, 27, 2, 97, 1000000007L};

        for (long N : testCases) {
            System.out.println("Input: " + N);
            System.out.println("Output: " + primeFactorization(N));
            System.out.println();
        }
    }
}
