import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int peopleCnt = 0;
        int maxCnt = 0;
        for(int i = 0; i < 4; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int peopleOut = Integer.parseInt(st.nextToken());
            int peopleIn = Integer.parseInt(st.nextToken());

            peopleCnt -= peopleOut;
            peopleCnt += peopleIn;

            maxCnt = Math.max(maxCnt, peopleCnt);
        }

        System.out.println(maxCnt);
    }
}
