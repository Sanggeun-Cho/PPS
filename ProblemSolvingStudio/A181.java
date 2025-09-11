import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int B_1 = B % 10;
        int B_10 = B / 10 % 10;
        int B_100 = B / 100 % 10;

        StringBuilder sb = new StringBuilder();

        sb.append(A * B_1).append('\n')
            .append(A * B_10).append('\n')
            .append(A * B_100).append('\n')
            .append(A * B);

        System.out.println(sb.toString());
    }
}
