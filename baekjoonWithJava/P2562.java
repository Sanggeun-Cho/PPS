import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int minIndex = 0;

        for(int i = 0; i < 9; i++){
            int num = Integer.parseInt(br.readLine());

            if(num > max) {
                max = num;
                minIndex = i;
            }
        }

        StringBuilder sb = new StringBuilder(32);
        sb.append(max).append('\n').append(minIndex + 1);

        System.out.println(sb.toString());
    }
}