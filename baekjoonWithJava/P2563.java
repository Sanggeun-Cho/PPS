import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] white = new int[100][100];

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());

            for(int j = row - 1; j < row + 9; j++){
                for(int k = col - 1; k < col + 9; k++){
                    if(white[j][k] == 0) white[j][k] = 1;
                }
            }
        }

        int extentSum = 0;

        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(white[i][j] == 1) extentSum++;
            }
        }

        System.out.println(extentSum);
    }
}
