import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1978 {
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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        isPrime_fun(1000); // Max Number is 1000

        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        for(int i = 0; i < count; i++){
            int number = Integer.parseInt(st.nextToken());

            if(isPrime[number]) answer++;
        }

        System.out.println(answer);
    }
}
