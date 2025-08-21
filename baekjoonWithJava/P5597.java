import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5597 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] students = new boolean[30];

        for(int i = 0; i < 28; i++){
            int num = Integer.parseInt(br.readLine());
            num--;

            students[num] = true;
        }

        StringBuilder sb = new StringBuilder(64);
        for(int i = 0; i < 30; i++){
            if(!students[i]) sb.append(i + 1).append('\n');
        }

        System.out.println(sb.toString());
    }
}