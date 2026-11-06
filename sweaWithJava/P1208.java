import java.io.*;
import java.util.StringTokenizer;

public class P1208 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int t = 1; t <= 10; t++){
            int N = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
            int[] boxHeight = new int[100];
            for(int i = 0; i < 100; i++){
                boxHeight[i] = Integer.parseInt(st.nextToken());
            }

            for(int i = 0; i < N; i++){
                int max = 0;
                int maxIdx = -1;
                int min = 100;
                int minIdx = -1;

                for(int j = 0; j < 100; j++){
                    if(max < boxHeight[j]) {
                        max = boxHeight[j];
                        maxIdx = j;
                    }
                    if(min > boxHeight[j]) {
                        min = boxHeight[j];
                        minIdx = j;
                    }
                }

                boxHeight[maxIdx]--;
                boxHeight[minIdx]++;
            }

            int max = 0;
            int min = 100;

            for(int j = 0; j < 100; j++){
                if(max < boxHeight[j]) {
                    max = boxHeight[j];
                }
                if(min > boxHeight[j]) {
                    min = boxHeight[j];
                }
            }

            sb.append("#").append(t).append(" ").append(max - min).append("\n");
        }

        System.out.println(sb);
    }
}