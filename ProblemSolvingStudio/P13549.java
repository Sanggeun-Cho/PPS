import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class P13549 {
    static int N;
    static int K;

    static int dist[] = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        System.out.println(bfs(N));
    }

    private static int bfs(int node){
        Deque<Integer> dq = new LinkedList<Integer>();

        for(int i = 0; i < 100001; i++) dist[i] = Integer.MAX_VALUE;
        dist[node] = 0;
        dq.add(node);

        while(!dq.isEmpty()) {
            int n = dq.pollFirst();

            if(n == K) return dist[n];

            // cost : 0
            int v = n * 2;
            if(v < 100001 && dist[v] > dist[n]){
                dist[v] = dist[n];
                dq.addFirst(v);
            }

            // cost : 1
            v = n - 1;
            if(v >= 0 && dist[v] > dist[n] + 1){
                dist[v] = dist[n] + 1;
                dq.addLast(v);
            }

            v = n + 1;
            if(v < 100001 && dist[v] > dist[n] + 1) {
                dist[v] = dist[n] + 1;
                dq.addLast(v);
            }
        }

        return -1;
    }
}
