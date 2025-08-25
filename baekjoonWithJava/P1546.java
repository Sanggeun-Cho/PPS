import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class P1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int subjectCount = Integer.parseInt(br.readLine());

        float totalScore = 0;
        float max = 0;
        float[] scores = new float[subjectCount];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < subjectCount; i++){
            scores[i] = Integer.parseInt(st.nextToken());

            if(scores[i] > max) max = scores[i];
        }

        for(int i = 0; i < subjectCount; i++){
            scores[i] = scores[i] / max * 100;

            totalScore += scores[i];
        }

        System.out.println(totalScore / subjectCount);
    }
}
