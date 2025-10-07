import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = N >= 5 ? N / 5 : 0;

        int remain = N - answer * 5;

        while(remain <= N){
            if(remain % 3 != 0){
                remain += 5;
                answer--;
            } else {
                answer += (remain / 3);
                remain = 0;
                break;
            }
        }

        if(remain > N) answer = -1;

        System.out.println(answer);
    }
}
