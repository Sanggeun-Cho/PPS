import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            int num = Integer.parseInt(br.readLine());

            arr[i] = num % 42;
        }

        // 나올 수 있는 수까지 범위 설정
        // 해당 문제는 num < 1000 조건
        boolean[] seen = new boolean[1000];
        int distinct = 0;

        // 중복여부 체크
        for (int x : arr){
            if(!seen[x]){
                seen[x] = true;
                distinct++;
            }
        }

        System.out.println(distinct);
    }
}