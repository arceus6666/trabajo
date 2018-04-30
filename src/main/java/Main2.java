/**
 * Created by Arceus6666 on 30/04/2018.
 */
import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
        int n = 11;
        // TODO Auto-generated method stub
        System.out.println("Pares");
        pares(n);
        System.out.println("\nFibonacci");
        fibonacci(n);
        System.out.println("\nPrimos");
        primos(n);

    }

    static void pares(int n) {
        for (int i = 0, j = 2; i < n; i++, j += 2) {
            System.out.print(j + ", ");
        }
    }

    static int[] fibo2(int n) {
        // System.out.println("n" + n);
        int[] memo = new int[n];
        memo[0] = 1;
        memo[1] = 1;
        for (int i = 2; i < n; i++) {
            memo[i] = memo[i - 2] + memo[i - 1];
        }
        return memo;
    }

    static void fibonacci(int n) {
        System.out.print(Arrays.toString(fibo2(n)));
    }

    static void primos(int n) {

        for (int j = 2, c2 = 0; j < Integer.MAX_VALUE && c2 < n; j++) {
            int c = 0;
            for (int k = 2; k <= j; k++) {
                if (j % k == 0)
                    c++;
            }
            if (c == 1) {
                System.out.print(j + ", ");
                c2++;
            }

        }
    }

}

