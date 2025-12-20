import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C080 {
    public static boolean[][] board;
    public static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        board = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < M; j++){
                if(line.charAt(j) == 'W') board[i][j] = true;
                else board[i][j] = false;
            }
        }

        int NRow = N - 7;
        int MCol = M - 7;

        for(int i = 0; i < NRow; i++){
            for(int j = 0; j < MCol; j++){
                find(i, j);
            }
        }

        System.out.println(min);
    }    

    public static void find(int x, int y){
        int endX = x + 8;
        int endY = y + 8;
        int count = 0;

        boolean TF = board[x][y];

        for(int i = x; i < endX; i++){
            for(int j = y; j < endY; j++){
                if(board[i][j] != TF) count++;
                TF = !TF;
            }

            TF = !TF;
        }

        count = Math.min(count, 64 - count);

        min = Math.min(min, count);
    }
}
