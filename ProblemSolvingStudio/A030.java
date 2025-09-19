import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A030 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int state = Integer.parseInt(st.nextToken()); // 0 : Good, 1 : Bad

        double[] ratio = new double[4];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++){
            ratio[i] = Double.parseDouble(st.nextToken());
            /*
             * [0] Good -> Good
             * [1] Good -> Bad
             * [2] Bad -> Good
             * [3] Bad -> Bad
             */
        }

        double good_answer = 1;
        double bad_answer = 1;
        if(state == 0) { // Good
            good_answer = good_answer * ratio[0];
            bad_answer = bad_answer * ratio[1];
        } else { // Bad
            good_answer = good_answer * ratio[2];
            bad_answer = bad_answer * ratio[3];
        }
        for(int i = 0; i < N -1; i++){
            double good_temp = good_answer * ratio[0] + bad_answer * ratio[2];
            double bad_temp = good_answer * ratio[1] + bad_answer * ratio[3];

            good_answer = good_temp;
            bad_answer = bad_temp;
        }

        // 소수점 자리 생각할 것
        System.out.println(Math.round(good_answer * 1000));
        System.out.println(Math.round(bad_answer * 1000));
    }
}
