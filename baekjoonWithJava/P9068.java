import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9068 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(1 >> 20);

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            String str = br.readLine();

            sb.append(str.charAt(0)).append(str.charAt(str.length() - 1)).append('\n');
        }

        System.out.println(sb.toString());
    }
}
