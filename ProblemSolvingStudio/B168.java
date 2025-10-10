import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B168 {
    static int[][] grid;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    static int N;
    static int cnt = 1;

    class Point {
        public int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        List<Integer> answer = new ArrayList<>();

        grid = new int[N][N];
        visited = new boolean[N][N];

        for(int i = 0; i < N; i++){
            String line = br.readLine();
            for(int j = 0; j < N; j++){
                grid[i][j] = line.charAt(j) - '0';
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    dfs(i, j);
                    answer.add(cnt);

                    cnt = 1;
                }
            }
        }

        Collections.sort(answer);

        StringBuilder sb = new StringBuilder();

        sb.append(answer.size()).append('\n');
        for(int each : answer){
            sb.append(each).append('\n');
        }

        System.out.println(sb);
    }

    public static void dfs(int x, int y){
        visited[x][y] = true;

        for(int i = 0; i < 4; i++){
            int nx = dx[i] + x;
            int ny = dy[i] + y;

            if(nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[nx][ny] && grid[nx][ny] == 1){
                cnt++;
                dfs(nx, ny);
            }
        }
    }
}
