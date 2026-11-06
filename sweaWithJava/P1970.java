import java.io.*;
import java.util.*;

public class P1970 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        int T = Integer.parseInt(br.readLine());

        for(int t = 1; t <= T; t++){
            sb.append("#").append(t).append("\n");

            int N = Integer.parseInt(br.readLine());

            for(int i = 0; i < 8; i++){
                if(N >= arr[i]) {
                    int count = N / arr[i];

                    N -= arr[i] * count;

                    sb.append(count).append(" ");
                } else {
                    sb.append("0 ");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
