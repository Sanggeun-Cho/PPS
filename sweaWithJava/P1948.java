import java.io.*;
import java.util.*;

public class P1948 {
    public static void main(String[] args) throws Exception {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());

        for(int t = 1; t <= T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[4];
            // 0: 첫번째 월 1: 첫번째 일 / 2: 두번째 월 3: 두번째 일

            for(int i = 0; i < 4; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int day = 0;
            for(int i = arr[0]; i < arr[2]; i++){
                day += days[i];
            }

            day = day - arr[1] + arr[3] + 1;

            StringBuilder sb = new StringBuilder();

            sb.append("#").append(t).append(" ").append(day);

            System.out.println(sb);
        }
    }
}
