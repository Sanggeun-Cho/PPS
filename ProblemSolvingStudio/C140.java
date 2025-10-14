import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// https://smartpro.tistory.com/18

public class C140 {
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

	private static int bfs(int node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(node);
		int n = 0;
		dist[node] = 1;
		while(queue.isEmpty() == false) {
			n = queue.poll();
			
			if(n == K)	{
				return dist[n] - 1;
			}
			if(n - 1 >= 0 && dist[n - 1] == 0) {
				dist[n - 1] = dist[n] + 1;
				queue.add(n - 1);
			}
			if(n + 1 < 100001 && dist[n + 1] == 0) {
				dist[n + 1] = dist[n]+1;
				queue.add(n + 1);
			}
			if(n * 2 < 100001 && dist[n * 2] == 0) {
				dist[n * 2] = dist[n] + 1;
				queue.add(n * 2);
			}
		}

		return -1;
	}
}
