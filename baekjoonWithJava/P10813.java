import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10813 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int bucketNum = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        int[] buckets = new int[bucketNum];

        for(int i = 0; i < bucketNum; i++){
            buckets[i] = i + 1;
        }

        for(int i = 0; i < count; i++){
            st = new StringTokenizer(br.readLine());

            int b1 = Integer.parseInt(st.nextToken());
            b1--;
            int b2 = Integer.parseInt(st.nextToken());
            b2--;

            int temp = buckets[b1];
            buckets[b1] = buckets[b2];
            buckets[b2] = temp;
        }

        StringBuilder sb = new StringBuilder(1 >> 20);

        for(int i = 0; i < bucketNum; i++){
            sb.append(buckets[i]).append(" ");
        }

        System.out.println(sb.toString());
    }
}