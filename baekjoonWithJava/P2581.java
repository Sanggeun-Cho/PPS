import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2581 {
    static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        isPrime_fun(N);

        int minPrime = 0;
        int sumPrime = 0;
        for(int i = M; i  <= N; i++){
            if(isPrime[i]) {
                if(minPrime == 0) minPrime = i;
                sumPrime += i;
            }
        }

        if(minPrime == 0){
            System.out.println(-1);
            return;
        }

        System.out.println(sumPrime + "\n" + minPrime);
    }

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
}
