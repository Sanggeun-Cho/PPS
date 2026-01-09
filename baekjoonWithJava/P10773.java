import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> arr = new Stack<>();

        int K = Integer.parseInt(br.readLine());

        for(int i = 0; i < K; i++){
            int n = Integer.parseInt(br.readLine());

            if(n == 0) {
                arr.pop();
            } else {
                arr.push(n);
            }
        }

        int result = 0;
        for(int i : arr){
            result += i;
        }

        System.out.println(result);
    }
}
