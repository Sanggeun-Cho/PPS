import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(1 >> 20);

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int repeatCnt = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for(int j = 0; j < str.length(); j++){
                for(int k = 0; k < repeatCnt; k++){
                    sb.append(str.charAt(j));
                }
            }
            sb.append('\n');
        }

        System.out.println(sb.toString());
    }
}
