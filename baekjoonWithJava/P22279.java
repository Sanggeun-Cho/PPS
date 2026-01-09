import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P22279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        double answer = 0;
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            answer += Double.parseDouble(st.nextToken()) * Double.parseDouble(st.nextToken());
        }

        System.out.printf("%.3f", answer);
    }
}
