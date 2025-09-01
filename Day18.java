import java.util.Scanner;

public class DivisorCounter {
  
    public static int countDivisors(int n) {
        int cnt = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i)
                    cnt += 1;  // Perfect square, count only once
                else
                    cnt += 2;  // Count both i and n/i
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        System.out.println(countDivisors(N));
    }
}
