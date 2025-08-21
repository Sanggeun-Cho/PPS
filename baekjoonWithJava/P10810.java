import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        int bucketNum = Integer.parseInt(st.nextToken());
        int ballCount = Integer.parseInt(st.nextToken());

        int[] buckets = new int[bucketNum];

        for(int i = 0; i < ballCount; i++){
            st = new StringTokenizer(br.readLine());

            int startBucket = Integer.parseInt(st.nextToken());
            int endBucket = Integer.parseInt(st.nextToken());

            int ballNum = Integer.parseInt(st.nextToken());

            for(int j = startBucket - 1; j < endBucket; j++){
                buckets[j] = ballNum;
            }
        }

        StringBuilder sb = new StringBuilder(1 >> 20);

        for(int i = 0; i < bucketNum; i++){
            sb.append(buckets[i]).append(" ");
        }

        System.out.println(sb.toString());
    }
}