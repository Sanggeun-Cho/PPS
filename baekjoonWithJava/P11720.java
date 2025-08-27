import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String numbers = br.readLine();

        int totalSum = 0;
        for(int i = 0; i < count; i++){
            int num = numbers.charAt(i) - '0';

            totalSum += num;
        }

        System.out.println(totalSum);
    }
}
