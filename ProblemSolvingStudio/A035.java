import java.io.*;
import java.util.*;

public class A035 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            double num = Double.parseDouble(st.nextToken());
            while(st.hasMoreTokens()){
                String op = st.nextToken();

                if(op.equals("@")){
                    num *= 3;
                } else if(op.equals("%")){
                    num += 5;
                } else {
                    num -= 7;
                }
            }

            sb.append(String.format("%.2f", num)).append('\n');
        }

        System.out.println(sb);
    }
}
