import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A197 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer setting = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(setting.nextToken());
        int M = Integer.parseInt(setting.nextToken());

        int[] balls = new int[N];
        for(int i = 0; i < N; i++){
            balls[i] = i + 1;
        }

        for(int i = 0; i < M; i++){
            StringTokenizer swap = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(swap.nextToken());
            int n2 = Integer.parseInt(swap.nextToken());
            int temp;

            temp = balls[n1 - 1];
            balls[n1 - 1] = balls[n2 - 1];
            balls[n2 - 1] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for(int i : balls){
            sb.append(i).append(' ');
        }

        System.out.println(sb);
    }
}
