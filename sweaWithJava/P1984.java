import java.io.*;
import java.util.*;

public class P1984 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int t = 1; t <= T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[10];
            int sum = 0;
            for(int i = 0; i < 10; i++){
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
            }

            sb.append("#").append(t).append(" ");

            double answer = (sum - returnMinPlusMax(arr)) / 8.0;
            long processedAnswer = Math.round(answer);
            sb.append(processedAnswer).append("\n");
        }

        System.out.println(sb);
    }

    private static int returnMinPlusMax(int[] arr) {
        int min = 10000;
        int max = 0;

        for(int i : arr){
            if(i < min) min = i;
            if(i > max) max = i;
        }

        return min + max;
    }
}
