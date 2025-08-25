import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int ballCount = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        int[] balls = new int[ballCount];
        for(int i = 0; i < ballCount; i++){
            balls[i] = i + 1;
        }

        for(int i = 0; i < count; i++){
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for(int j = 0; j < ((end - start) / 2) + 1; j++){
                int temp = balls[start - 1 + j];
                balls[start - 1 + j] = balls[end - 1 - j];
                balls[end - 1 - j] = temp;
            }
        }

        StringBuilder sb = new StringBuilder(1 >> 20);
        for(int b : balls){
            sb.append(b).append(" ");
        }

        System.out.println(sb.toString());
    }
}
