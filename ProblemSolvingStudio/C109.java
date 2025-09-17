import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class C109 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Map<Integer, Integer> freq = new HashMap<>(N * 2);
        for(int i = 0; i < N; i++) {
            int v = Integer.parseInt(st.nextToken());
            freq.merge(v, 1, Integer::sum);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            int q = Integer.parseInt(st.nextToken());
            
            sb.append(freq.getOrDefault(q,0)).append(' ');
        }

        System.out.println(sb.toString().trim());
    }
}
