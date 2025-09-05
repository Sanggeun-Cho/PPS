import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(1 >> 20);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        int[][] firstMatrix = new int[row][col];

        for(int i = 0; i < row; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < col; j++){
                firstMatrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] resultMatrix = new int[row][col];

        for(int i = 0; i < row; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < col; j++){
                int secondMatrix = Integer.parseInt(st.nextToken());
                resultMatrix[i][j] = firstMatrix[i][j] + secondMatrix;

                sb.append(resultMatrix[i][j]).append(" ");
            }
            sb.append('\n');
        }

        System.out.println(sb.toString());
    }
}
