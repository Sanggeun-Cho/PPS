import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SG008 {
    public static int[][] square;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        square = new int[N][M];

        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < M; j++){
                square[i][j] = line.charAt(j) - '0';
            }
        }

        int maxLen = Math.min(N, M);

        outerLoop:
        while(true){
            for(int i = 0; i < N - maxLen; i++){
                for(int j = 0; j < M - maxLen; j++){
                    if(square[i][j] == square[i + maxLen][j] && square[i][j] == square[i][j + maxLen] && square[i][j] == square[i + maxLen][j + maxLen]){
                        break outerLoop;
                    }
                }
            }
            maxLen--;
        }

        maxLen++;
        System.out.println(maxLen * maxLen);
    }
}
