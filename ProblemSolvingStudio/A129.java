import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A129 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int[] dp = new int[12];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i = 0; i < N; i++){
            int input = Integer.parseInt(br.readLine());

            for(int j = 4; j <= input; j++){
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }

            sb.append(dp[input]).append('\n');
        }

        System.out.println(sb);
    }
}
