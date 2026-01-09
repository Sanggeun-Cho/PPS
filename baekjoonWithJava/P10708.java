import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10708 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] target = new int[M];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            target[i] = Integer.parseInt(st.nextToken());
        }

        int[] score = new int[N];
        for(int i = 0; i < N; i++){
            score[i] = 0;
        }

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                if(Integer.parseInt(st.nextToken()) == target[i]){
                    score[j]++;
                } else {
                    score[target[i] - 1]++;
                }
            }
        }

        for(int i : score){
            System.out.println(i);
        }
    }
}
