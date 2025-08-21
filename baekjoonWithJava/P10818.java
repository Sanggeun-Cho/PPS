import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < count; i++){
            int num = Integer.parseInt(st.nextToken());

            if(num < min) min = num;
            if(num > max) max = num;
        }

        StringBuilder sb = new StringBuilder(32);
        sb.append(min).append(" ").append(max);

        System.out.println(sb.toString());
    }
}