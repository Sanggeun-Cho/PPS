import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());

        int[][] apt = new int[15][15]; // 층수 | 호수

        for(int i = 1; i < 15; i++){
            apt[0][i] = i;
        }

        for(int height = 1; height < 15; height++){
            for(int width = 1; width < 15; width++){
                apt[height][width] = apt[height - 1][width] + apt[height][width - 1];
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            sb.append(apt[k][n]).append('\n');
        }
        
        System.out.println(sb);
    }
}