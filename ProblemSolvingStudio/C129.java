import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class C129 {
    static int[][] board;
    static int W, H;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    private static class Tomato {
        int x, y;

        public Tomato(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static Queue<Tomato> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        board = new int[W][H];

        for(int i = 0; i < H; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < W; j++){
                board[j][i] = Integer.parseInt(st.nextToken());

                if(board[j][i] == 1){
                    queue.add(new Tomato(j, i));
                }
            }
        }

        bfs();

        int max = 0;

        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if(board[j][i] == 0){
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, board[j][i]);
            }
        }

        System.out.println(max - 1);
    }

    public static void bfs(){
        while(!queue.isEmpty()){
            Tomato curTomato = queue.poll();

            for(int i = 0; i < 4; i++){
                int nx = curTomato.x + dx[i];
                int ny = curTomato.y + dy[i];

                if(nx >= 0 && nx < W
                    && ny >= 0 && ny < H){
                        if(board[nx][ny] == 0){
                            queue.add(new Tomato(nx, ny));
                            board[nx][ny] = board[curTomato.x][curTomato.y] + 1;
                        }
                    }
            }
        }
    }
}
