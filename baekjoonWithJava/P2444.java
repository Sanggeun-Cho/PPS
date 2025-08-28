import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder(1 >> 20);

        for(int i = 0; i < count; i++){
            for(int j = 0; j < count - i - 1; j++){
                sb.append(" ");
            }
            for(int j = 0; j < i * 2 + 1; j++){
                sb.append("*");
            }
            sb.append('\n');
        }
        for(int i = 1; i < count; i++){
            for(int j = 0; j < i; j++){
                sb.append(" ");
            }
            for(int j = 0; j < (count - i - 1) * 2 + 1; j++){
                sb.append("*");
            }
            sb.append('\n');
        }

        System.out.println(sb.toString());
    }
}
