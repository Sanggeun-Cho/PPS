import java.io.*;
import java.util.*;

public class P1926 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int T = Integer.parseInt(br.readLine());

        char c1 = '3';
        char c2 = '6';
        char c3 = '9';
        StringBuilder sb = new StringBuilder();

        for(int t = 1; t <= T; t++){
            String num = t + "";
            
            boolean flag = false;

            for(char c : num.toCharArray()){
                if(c == c1 || c == c2 || c == c3){
                    // 포함될 때마다
                    sb.append("-");
                    flag = true;
                }
            }

            if(!flag) {
                sb.append(num);
            }

            sb.append(" ");
        }

        System.out.println(sb);
    }
}
