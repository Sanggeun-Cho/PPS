import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class B006 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cntNode = Integer.parseInt(st.nextToken());
        int cntEdge = Integer.parseInt(st.nextToken());
        int startNode = Integer.parseInt(st.nextToken()) - 1; // for index

        int[][] graph = new int[cntNode][cntNode];

        for(int i = 0; i < cntEdge; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;

            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        boolean[] visitedDNF = new boolean[cntNode];
        dfs(graph, startNode, cntNode, visitedDNF);

        System.out.println();

        boolean[] visitedBNF = new boolean[cntNode];
        bfs(graph, startNode, cntNode, visitedBNF);
    }

    static void bfs(int[][] graph, int start, int cntNode, boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.print((node + 1) + " ");

            for(int nextNode = 0; nextNode < cntNode; nextNode++){
                if(graph[node][nextNode] == 1 && !visited[nextNode]){
                    queue.add(nextNode);
                    visited[nextNode] = true;
                }
            }
        }
    }

    static void dfs(int[][] graph, int start, int cntNode, boolean[] visited){
        visited[start] = true;
        System.out.print((start + 1) + " ");

        for(int nextNode = 0; nextNode < cntNode; nextNode++){
            if(graph[start][nextNode] == 1 && !visited[nextNode]) dfs(graph, nextNode, cntNode, visited);
        }
    }
}
