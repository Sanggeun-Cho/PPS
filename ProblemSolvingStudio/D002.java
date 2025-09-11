import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i < cnt; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int H_cnt = 1;
            int W_cnt = 1;

            for(int j = 2; j <= N; j++){
                H_cnt++;
                
                if(H_cnt > H) {
                    H_cnt = 1;
                    W_cnt++;
                }
            }

            System.out.println(H_cnt * 100 + W_cnt);
        }
    }
}
