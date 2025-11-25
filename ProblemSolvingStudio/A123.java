import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A123 {
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new Integer[n + 1];
        dp[0] = dp[1] = 0;

        System.out.println(recur(n));
    }

    static int recur (int n) {
        if (dp[n] == null) {
            int case1 = Integer.MAX_VALUE;
            int case2 = Integer.MAX_VALUE;
            int case3 = Integer.MAX_VALUE;
            
            if (n % 3 == 0) case1 = recur(n/3);
            if (n % 2 == 0) case2 = recur(n/2);
            case3 = recur(n-1);
            
            dp[n] = Math.min(case1, Math.min(case2, case3)) + 1;
        }
        
        return dp[n];
    }
}

