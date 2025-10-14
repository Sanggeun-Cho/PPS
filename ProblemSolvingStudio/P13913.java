import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class P13913 {
    static int N;
	static int K;
	
	static int dist[] = new int[100001];
    static int parent[] = new int[100001];

	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
        bfs(N);
		System.out.println(dist[K] - 1);
        System.out.println(recoverPath());
	}

	private static void bfs(int node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(node);
		dist[node] = 1;
        parent[node] = -1;

		while(queue.isEmpty() == false) {
			int n = queue.poll();
			
			if(n == K)	return;
			if(n - 1 >= 0 && dist[n - 1] == 0) {
				dist[n - 1] = dist[n] + 1;
                parent[n - 1] = n;
				queue.add(n - 1);
			}
			if(n + 1 < 100001 && dist[n + 1] == 0) {
				dist[n + 1] = dist[n]+1;
                parent[n + 1] = n;
				queue.add(n + 1);
			}
			if(n * 2 < 100001 && dist[n * 2] == 0) {
				dist[n * 2] = dist[n] + 1;
                parent[n * 2] = n;
				queue.add(n * 2);
			}
		}
	}

    private static String recoverPath() {
        Stack<Integer> stk = new Stack<>();
        for (int cur = K; cur != -1; cur = parent[cur]) stk.push(cur);

        StringBuilder sb = new StringBuilder();
        while (!stk.isEmpty()) sb.append(stk.pop()).append(' ');
        return sb.toString().trim();
    }
}
