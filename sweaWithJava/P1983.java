import java.io.*;
import java.util.*;

public class P1983 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] rate = {0.35, 0.45, 0.2};
        
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int t = 1; t <= T; t++){
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken()) - 1;

            double[] student = new double[N];
            for(int i = 0; i < N; i++){
                st = new StringTokenizer(br.readLine());

                student[i] = 0;

                for(int j = 0; j < 3; j++){
                    int num = Integer.parseInt(st.nextToken());

                    student[i] += num * rate[j];
                }
            }

            int rank = 0;
            for(double d : student) {
                if(d > student[index]) rank++;
            }

            String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

            System.out.println("#" + t + " " + grade[rank / (N / 10)]);
        }
    }
}
