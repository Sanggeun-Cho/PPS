import java.io.*;
import java.util.*;

public class P1288 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i <= T; i++){
            Set<Integer> zeroToNine = new HashSet<>();

            int N = Integer.parseInt(br.readLine());
            int cnt = 0;

            while(zeroToNine.size() < 10){
                cnt++;
                int dividedN = N * cnt;
                
                while(dividedN >= 1){
                    zeroToNine.add(dividedN % 10);
                    dividedN /= 10;
                }
            }

            System.out.println("#" + i + " " + (N * cnt));
        }
    }
}
