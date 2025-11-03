import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int moneyY = 0;
        int moneyM = 0;
        for(int i = 0; i < N; i++){
            int time = Integer.parseInt(st.nextToken());

            moneyY += (time / 30 + 1) * 10;
            moneyM += (time / 60 + 1) * 15;
        }

        String initial;
        int result;
        
        if(moneyY < moneyM){
            initial = "Y";
            result = moneyY;
        } else if (moneyM < moneyY){
            initial = "M";
            result = moneyM;
        } else {
            initial = "Y M";
            result = moneyM;
        }
        
        System.out.println(initial + " " + result);
    }
}
