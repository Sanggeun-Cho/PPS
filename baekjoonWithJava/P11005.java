import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder(1 >> 20);

        while(true){
            int r = N % B;
            N /= B;

            char c;

            if(r >= 0 && r <= 9){
                c = (char)(r + '0');
            } else {
                c = (char)(r - 10 + 'A');
            }

            sb.append(c);

            if(N < 1) break;
        }

        StringBuffer strbrf = new StringBuffer(sb);
        String answer = strbrf.reverse().toString();

        System.out.println(answer);
    }
}
