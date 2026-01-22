import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14645 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String K = st.nextToken();

        String[] trash = new String[N];
        for(int i = 0; i < N; i++){
            trash[i] = br.readLine();
        }

        System.out.println("비와이");
    }
}
