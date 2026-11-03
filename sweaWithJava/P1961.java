import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1961 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            int N = Integer.parseInt(br.readLine());

            int[][] matrix = new int[N][N];

            for(int i = 0; i < N; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j = 0; j < N; j++){
                    matrix[j][i] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] answer = new int[N][N];

            // 90
            // 02 01 00 12 11 10 22 21 20
            // i++ -> j--
            for(int i = 0; i < N; i++){
                for(int j = N - 1; j >= 0; j--){
                    answer[0][i] = answer[0][i] * 10 + matrix[i][j];
                }
            }

            // 180
            // 22 12 02 21 11 01 20 10 00
            // j-- -> i--
            for(int j = N - 1; j >= 0; j--){
                for(int i = N - 1; i >= 0; i--){
                    answer[1][N - j - 1] = answer[1][N - j - 1] * 10 + matrix[i][j];
                }
            }

            // 270
            // 20 21 22 10 11 12 00 01 02
            // i-- -> j++
            for(int i = N - 1; i >= 0; i--){
                for(int j = 0; j < N; j++){
                    answer[2][N - i - 1] = answer[2][N - i - 1] * 10 + matrix[i][j];
                }
            }

            StringBuilder sb = new StringBuilder();

            sb.append("#" + (t + 1)).append("\n");
            for(int i = 0; i < N; i++){
                for(int j = 0; j < 3; j++){
                    sb.append(answer[j][i] + " ");
                }
                sb.append("\n");
            }

            System.out.println(sb);
        }
    }
}
