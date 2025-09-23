import java.io.*;
import java.util.*;

public class C114 {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static int N, M;
    static int[][] map;
    static boolean[][] visited;

    private static class Node {
        int y, x;
        public Node(int y, int x){
            this.y = y;
            this.x = x;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < M; j++){
                map[i][j] = line.charAt(j) - '0';
            }
        }

        bfs();
    }

    static void bfs(){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(0, 0));
        visited[0][0] = true;

        while(!queue.isEmpty()){
            Node node = queue.poll();

            for(int i = 0; i < 4; i++){
                int ny = node.y + dy[i];
                int nx = node.x + dx[i];

                if(ny >= 0 && ny < N && nx >= 0 && nx < M){
                    if(map[ny][nx] == 1 && !visited[ny][nx]){
                        visited[ny][nx] = true;
                        map[ny][nx] = map[node.y][node.x] + 1;
                        queue.offer(new Node(ny, nx));
                    }
                }
            }
        }

        System.out.println(map[N-1][M-1]);
    }
}
