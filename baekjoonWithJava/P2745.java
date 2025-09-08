import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2745 {
    public static void main(String[] args) throws IOException {
        // 진법에 대한 개념을 이해하지 못함
        // 진법 공부 후 나중에 다시 풀기를 권장

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        int result = 0;
        int power = 1;

        for (int i = N.length() - 1; i >= 0; i--) {
            char c = N.charAt(i);
            int num;

            if (c >= '0' && c <= '9') {
                num = c - '0';
            } else {
                num = c - 'A' + 10;
            }

            result += num * power;
            power *= B;
        }

        System.out.println(result);
    }
}
