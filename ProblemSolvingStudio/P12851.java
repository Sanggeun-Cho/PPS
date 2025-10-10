import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P12851 {
    static int N;
    static int K;

    static int dist[] = new int[100001];
    static int count[] = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] ans = bfs(N);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }

    private static int[] bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(node);
        dist[node] = 1;
        count[node] = 1;

        while(!queue.isEmpty()) {
            int n = queue.poll();

            int[] nexts = {n - 1, n + 1, n * 2};
            for(int v : nexts) {
                if(v < 0 || v >= 100001) continue;

                if(dist[v] == 0){
                    dist[v] = dist[n] + 1;
                    count[v] = count[n];
                    queue.add(v);
                } else if (dist[v] == dist[n] + 1){
                    count[v] += count[n];
                }
            }
        }

        return new int[] {dist[K] - 1, count[K]};
    }
}
