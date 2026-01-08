import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int[] coins = new int[N];
        for(int i = 0; i < N; i++){
            coins[i] = Integer.parseInt(br.readLine());
        }

        int cur = coins.length - 1;
        int cnt = 0;
        while(target > 0){
            if(coins[cur] <= target) {
                target -= coins[cur];
                cnt++;
            } else if(cur > 0) {
                cur--;
            } else break;
        }

        System.out.println(cnt);
    }
}
