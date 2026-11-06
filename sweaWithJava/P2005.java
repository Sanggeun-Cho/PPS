import java.io.*;
import java.util.*;

public class P2005 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[][] dp = new int[11][11];

        dp[1][1] = 1;
        for(int i = 2; i <= 10; i++){
            for(int j = 2; j <= i; j++){
                dp[i][1] = 1;
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                dp[i][i] = 1;
            }
        }
        StringBuilder sb = new StringBuilder();

        for(int t = 1; t <= T; t++){
            int N = Integer.parseInt(br.readLine());

            sb.append("#").append(t).append("\n");
            for(int i = 1; i <= N; i++){
                for(int j = 1; j <= i; j++){
                    sb.append(dp[i][j]).append(" ");
                }
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}
