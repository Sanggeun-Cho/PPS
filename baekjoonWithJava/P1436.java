import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1436 {
    static int maxNum = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int order = 1;
        int target = 665;
        while(order <= N){
            for(int i = target + 1; i < maxNum; i++){
                String str = i + "";
                if(str.contains("666")) {
                    target = i;
                    order++;
                    break;
                }
            }
        }

        System.out.println(target);
    }
}
