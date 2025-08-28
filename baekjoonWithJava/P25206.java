import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        double scoreSum = 0;
        double creditSum = 0;

        while((line = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(line);

            String subject = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            double score = gradeChanger(grade);

            scoreSum = scoreSum + (credit * score);
            if(!grade.equals("P")) creditSum += credit;
        }

        System.out.println(scoreSum / creditSum);
    }

    private static double gradeChanger(String g) {
        switch (g) {
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            default:   return 0.0;
        }
    }
}
