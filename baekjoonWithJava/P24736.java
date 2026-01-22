import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P24736 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int visitScore = 0;
        int homeScore = 0;

        int[] scores = {6, 3, 2, 1, 2};

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 5; i++){
            visitScore += Integer.parseInt(st.nextToken()) * scores[i];
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 5; i++){
            homeScore += Integer.parseInt(st.nextToken()) * scores[i];
        }

        System.out.println(visitScore + " " + homeScore);
    }
}
