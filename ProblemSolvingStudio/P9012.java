import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < T; i++){
            int rightOpenCnt = 0; // (
            int leftOpenCnt = 0; // )
            boolean b = false;

            String VPS = br.readLine();

            if(VPS.startsWith(")") || VPS.endsWith("(")){
                answer.append("NO");
                answer.append("\n");
                continue;
            }
            
            for(int c : VPS.toCharArray()){
                if(c == '(') rightOpenCnt++;
                else leftOpenCnt++;

                if(leftOpenCnt > rightOpenCnt){
                    answer.append("NO");
                    b = true;
                    break;
                }
            }

            if(b) {
                answer.append("\n");
                continue;
            }
            
            if(leftOpenCnt == rightOpenCnt) answer.append("YES");
            else answer.append("NO");

            answer.append("\n");
        }

        System.out.println(answer);
    }
}
