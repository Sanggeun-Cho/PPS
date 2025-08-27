import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().trim();

        if(str.isEmpty()) System.out.println(0);
        else {
            int wordCnt = 0;
            
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == ' ') wordCnt++;
            }
            System.out.println(wordCnt + 1);
        }
    }
}
