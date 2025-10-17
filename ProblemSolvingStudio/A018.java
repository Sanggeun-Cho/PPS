import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class A018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        int[] A = new int[cnt];
        int[] B = new int[cnt];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < cnt; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < cnt; i++){
            B[i] = Integer.parseInt(st.nextToken());
        }

        int[] newA = new int[cnt];
        Arrays.sort(A);

        Integer[] idx = new Integer[cnt];
        for (int i = 0; i < cnt; i++) idx[i] = i;
        
        Arrays.sort(idx, (i, j) -> Integer.compare(B[j], B[i]));

        for(int i = 0; i < cnt; i++){
            newA[idx[i]] = A[i];
        }

        int answer = 0;
        for(int i = 0; i < cnt; i++){
            answer += newA[i] * B[i];
        }

        System.out.println(answer);
    }
}
