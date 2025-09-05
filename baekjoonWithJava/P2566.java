import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;

        StringTokenizer st;
        int maxRow = 0;
        int maxCol = 0;

        for(int i = 0; i < 9; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
                int num = Integer.parseInt(st.nextToken());
                if(num > max) {
                    max = num;
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        StringBuilder sb = new StringBuilder(64);
        sb.append(max).append('\n')
        .append(maxRow + 1).append(" ").append(maxCol + 1);

        System.out.println(sb.toString());
    }
}
