import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10886 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int c = 0;
        int nc = 0;
        for(int i = 0; i < N; i++){
            if(Integer.parseInt(br.readLine()) == 0) nc++;
            else c++;
        }

        System.out.println(c > nc ? "Junhee is cute!" : "Junhee is not cute!");
    }
}
