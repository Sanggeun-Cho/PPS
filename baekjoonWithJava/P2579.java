import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[300];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[300];
        
        if(N <= 2){
            int sum = 0;

            for(int i : arr){
                sum += i;
            }

            System.out.println(sum);
        } else {
            dp[0] = arr[0];
            dp[1] = arr[0] + arr[1];
            dp[2] = arr[0] + arr[2];

            for(int i = 3; i < N; i++){
                dp[i] = Math.max(dp[i - 3] + arr[i - 1] + arr[i], dp[i - 2] + arr[i]);
            }

            System.out.println(dp[N - 1]);
        }
    }
}
