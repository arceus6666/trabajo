/**
 * Created by Arceus6666 on 30/04/2018.
 */
import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {

        final int N = 11;
        System.out.println("Pares");
        System.out.print(Arrays.toString(getNPairs(N)));
        System.out.println("\nFibonacci");
        System.out.print(Arrays.toString(getNFibonacci(N)));
        System.out.println("\nPrimos");
        System.out.print(Arrays.toString(getNPrimes(N)));

    }

    /**
     *
     * @param n
     * @return
     */
    static int[] getNPairs(int n) {
        int[] res = new int[n];
        for (int i = 1; i <= n; i++) {
            res[i-1]=i*2;
        }
        return res;
    }


    /**
     *
     * @param n
     * @return
     */
    static int[] getNFibonacci(int n) {
        int[] memo = new int[n];
        memo[0] = 1;
        memo[1] = 1;
        for (int i = 2; i < n; i++) {
            memo[i] = memo[i - 2] + memo[i - 1];
        }
        return memo;
    }

    /**
     *
     * @param n
     * @return
     */
    static int[] getNPrimes(int n) {
        int[] res= new int[n];
        for (int j = 2, count2 = 0; j < Integer.MAX_VALUE && count2 < n; j++) {
            int count = 0;
            for (int k = 2; k <= j; k++) {
                if (j % k == 0)
                    count++;
            }
            if (count == 1) {
                //System.out.print(j + ", ");
                res[count2] = j;
                count2++;
            }
        }
        return res;
    }

}

