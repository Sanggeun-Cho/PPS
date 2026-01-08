import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int returnNum = 0;

        for(int i = 0; i < N; i++){
            int num = i; // 자릿수를 빼기 위한 변수
            returnNum = i; // 생성자로써 리턴해 줄 변수
            int result = num; // 자릿수를 기존 수에 더한 값을 낼 변수
            while(!(num < 1)){ // 자릿수가 남은 경우 계속
                int n = num % 10; // 자릿수를 n으로 추출
                num /= 10; // num의 다음 자릿수를 보기 위함

                result += n; // 기존 수에 더하기
            }

            if(result == N) break;
        }

        if(returnNum == N - 1) System.out.println(0);
        else System.out.println(returnNum);
    }
}
