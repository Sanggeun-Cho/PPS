import java.io.*;
import java.util.*;

public class P1976 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int t = 1; t <= T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int hour = 0;
            int minute = 0;

            int[] arr = new int[4];
            for(int i = 0; i < 4; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            minute += arr[1] + arr[3];
            if(minute >= 60) {
                hour++;
                minute -= 60;
            }

            hour += arr[0] + arr[2];
            if(hour > 12) hour -= 12;

            sb.append("#").append(t).append(" ").append(hour).append(" ").append(minute).append("\n");
        }

        System.out.println(sb);
    }
}
