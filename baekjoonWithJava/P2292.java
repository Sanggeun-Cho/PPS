import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int start = 1;
        int answer = 1;

        while(start < num){
            start += 6 * answer;

            answer++;
        }

        System.out.println(answer);
    }
}
