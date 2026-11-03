import java.io.*;
import java.util.StringTokenizer;

public class P120887 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int i = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(solution(i, j, k));
    }

    public static int solution(int i, int j, int k) {
        int cnt = 0;
        for(int number = i; number <= j; number++){
            int tmp = number;
            while(tmp >= 1){
                if(tmp % 10 == k) cnt++;
                tmp /= 10;
            }
        }

        return cnt;
    }
}