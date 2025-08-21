import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(1 >> 20);

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int count = Integer.parseInt(st.nextToken());
        int comparedNum = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[count];
        for(int i = 0; i < count; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < count; i++){
            if(arr[i] < comparedNum) sb.append(arr[i]).append(" ");
        }

        System.out.println(sb.toString());
    }
}