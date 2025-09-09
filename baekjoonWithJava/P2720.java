import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[] coins = {25, 10, 5, 1};

        for(int i = 0; i < num; i++){
            int cash = Integer.parseInt(br.readLine());
            int forNext = 0;

            int[] coinCnt = new int[4];

            while(forNext < 4){
                if(cash - coins[forNext] < 0){
                    forNext++;
                    continue;
                }

                cash -= coins[forNext];
                coinCnt[forNext]++;
            }

            StringBuilder sb = new StringBuilder(1 >> 20);

            for(int j : coinCnt) sb.append(j).append(' ');

            System.out.println(sb.toString());
        }
    }
}
