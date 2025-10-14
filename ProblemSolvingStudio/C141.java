import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class C141 {
    static class Node {
        int x, y;
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static int M, N;
    static int[][] land;
    static boolean[][] visited;
    static int cnt;

    // UP, DOWN, LEFT, RIGHT
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int now = 0; now < T; now++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken()); // max X
            N = Integer.parseInt(st.nextToken()); // max Y
            int K = Integer.parseInt(st.nextToken());

            land = new int[50][50];
            visited = new boolean[50][50];
            cnt = 0;
        
            for(int i = 0; i < K; i++){
                st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                land[x][y] = 1;
            }

            for(int x = 0; x < M; x++){
                for(int y = 0; y < N; y++){
                    if(land[x][y] == 1 && !visited[x][y]){
                        bfs(x, y);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    static void bfs(int x, int y){
        Queue<Node> q = new LinkedList<>();

        Node node = new Node(x, y);
        q.add(node);
        visited[x][y] = true;

        while(!q.isEmpty()){
            Node cur = q.poll();
            for(int i = 0; i < 4; i++){
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if(nx >= 0 && nx < M && ny >= 0 && ny < N && land[nx][ny] == 1 && !visited[nx][ny]){
                    q.add(new Node(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }
    }
}
