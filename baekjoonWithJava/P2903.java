import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int first = 2;

        for(int i = 0; i < num; i++){
            first = first * 2 - 1;
        }

        System.out.println((int)Math.pow(first, 2));
    }
}
