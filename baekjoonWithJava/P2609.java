import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int biggerValue = Math.max(N, M);

        int GCD = 0; // 최대공약수 Greatest Common Divisor
        int LCM = 0; // 최소공배수 Least Common Multiple


        for(int i = biggerValue; i > 0; i--){
            if(N % i == 0 && M % i == 0){
                GCD = i;
                break;
            }
        }

        for(int i = biggerValue; i <= N * M; i++){
            if(i % N == 0 && i % M == 0){
                LCM = i;
                break;
            }
        }

        System.out.println(GCD);
        System.out.println(LCM);
    }
}
