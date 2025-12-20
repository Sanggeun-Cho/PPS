import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SG009 {
    static int N, M, max = 0;
    static int[][] chicken;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        chicken = new int[N][M];
        visited = new boolean[M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                chicken[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);
        System.out.println(max);
    }

    static void dfs(int depth, int start){
        if(depth == 3){
            int sum = 0;

            for(int i = 0; i < N; i++){
                int num = 0;

                for(int j = 0; j < M; j++){
                    if(visited[j] == true) num = Math.max(num, chicken[i][j]);
                }
                 
                sum += num;
            }
            max = Math.max(max, sum);

            return;
        }

        for(int i = start; i < M; i++){
            if(visited[i] == false) {
                visited[i] = true;
                dfs(depth + 1, i + 1);
                visited[i] = false;
            }
        }
    }
}
