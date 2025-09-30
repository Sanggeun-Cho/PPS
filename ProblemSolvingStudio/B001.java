import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B001 {
    static int[][] graph;
    static boolean[] visited;
    static int node, edge;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        node = Integer.parseInt(br.readLine());
        edge = Integer.parseInt(br.readLine());

        graph = new int[node + 1][node + 1];
        visited = new boolean[node + 1];

        for(int i = 0; i < edge; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            graph[from][to] = 1;
            graph[to][from] = 1;
        }

        bfs();
    }

    public static void bfs(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;
        int comCnt = 0;

        while(!queue.isEmpty()){
            int curNode = queue.poll();

            for(int nxtNode = 1; nxtNode <= node; nxtNode++){
                if(graph[curNode][nxtNode] == 1 && !visited[nxtNode]){
                    queue.add(nxtNode);
                    visited[nxtNode] = true;
                    comCnt++;
                }
            }
        }

        System.out.println(comCnt);
    }
}
