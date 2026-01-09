import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if(N < 100) {
            System.out.println(N);
            return;
        }

        int result = 99;

        for(int i = 100; i <= N && i != 1000; i++){
            int num = i;
            int thirdN = num % 10;
            num /= 10;
            int secondN = num % 10;
            num /= 10;
            int firstN = num % 10;

            if((firstN - secondN) == (secondN - thirdN)){
                result++;
            }
        }

        System.out.println(result);
    }
}
