import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        int cnt = 0;
        for(char each : str.toCharArray()){
            sb.append(each);
            cnt++;
            if(cnt % 10 == 0) sb.append('\n');
        }

        System.out.println(sb);
    }    
}
