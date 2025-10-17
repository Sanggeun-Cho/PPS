import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A017 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int[] sticker = new int[9];
        // 0, 1, 2, 3, 4, 5, 6(9), 7, 8

        String line = br.readLine();
        int answer = 0;

        for(char each : line.toCharArray()){
            int num = each - '0';
            if(num == 9) num = 6;
            sticker[num]++;
        }
        sticker[6] /= 2;

        for(int each : sticker){
            answer = Math.max(answer, each);
        }

        System.out.println(answer);
    }
}
