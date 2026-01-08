import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1929 {
    static boolean[] isPrime;

    static void isPrime_fun(int n) {
        isPrime = new boolean[n + 1];

        for(int i = 0; i < isPrime.length; i++){
            isPrime[i] = true;
        }

        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(isPrime[i]){
                for(int j = i * i; j <= n; j += i){
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        isPrime_fun(1000000);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        for(int i = N; i <= M; i++){
            if(isPrime[i]) {
                sb.append(i).append('\n');
            }
        }

        System.out.println(sb);
    }
}
