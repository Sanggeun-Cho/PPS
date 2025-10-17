import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A019 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int ABC = A * B * C;
        String ABCSting = ABC + "";
        
        int[] countNum = new int[10];

        for(char each : ABCSting.toCharArray()){
            countNum[each - '0']++;
        }

        StringBuilder sb = new StringBuilder();

        for(int each : countNum){
            sb.append(each).append('\n');
        }

        System.out.println(sb);
    }
}
