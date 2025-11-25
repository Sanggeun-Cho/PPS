import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SG007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int MAX = 40;
        int[] zero = new int[MAX + 1];
        int[] one = new int[MAX + 1];

        zero[0] = 1;
        zero[1] = 0;
        one[0] = 0;
        one[1] = 1;

        for(int i = 2; i <= MAX; i++){
            zero[i] = zero[i - 1] + zero[i - 2];
            one[i] = one[i - 1] + one[i - 2];
        }

        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < N; i++){
            int input = Integer.parseInt(br.readLine());
            sb.append(zero[input]).append(" ").append(one[input]).append("\n");
        }

        System.out.println(sb);
    }
}
