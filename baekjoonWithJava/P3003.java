import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] chessPieces = {1, 1, 2, 2, 2, 8};

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder(1 >> 20);

        for(int i = 0; i < chessPieces.length; i++){
            int current = Integer.parseInt(st.nextToken());

            chessPieces[i] -= current;
            sb.append(chessPieces[i]).append(" ");
        }

        System.out.println(sb.toString());
    }
}
