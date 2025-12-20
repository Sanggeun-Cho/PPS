import java.io.*;
import java.util.*;

public class SG010 {
    public static int[][] board;
    static int max = Integer.MIN_VALUE;
    static boolean[][] visit;
    static int N;
    static int M;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new int[N][M];
        visit = new boolean[N][M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                visit[i][j] = true;
                dfs(i, j, board[i][j], 1);
                visit[i][j] = false;
            }
        }

        System.out.println(max);
    }

    static void dfs(int row, int col, int sum, int count){
        if(count == 4) {
            max = Math.max(max, sum);
            return;
        }

        for(int i = 0; i < 4; i++){
            int curRow = row + dx[i];
            int curCol = col + dy[i];

            if(curRow < 0 || curRow >= N || curCol < 0 || curCol >= M){
                continue;
            }

            if(!visit[curRow][curCol]) {
                if(count == 2){
                    visit[curRow][curCol] = true;
                    dfs(row, col, sum + board[curRow][curCol], count + 1);
                    visit[curRow][curCol] = false;
                }

                visit[curRow][curCol] = true;
                    dfs(curRow, curCol, sum + board[curRow][curCol], count + 1);
                    visit[curRow][curCol] = false;
            }
        }
    }
}
