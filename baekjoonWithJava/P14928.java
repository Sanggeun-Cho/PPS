import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P14928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String N = br.readLine();

        long temp = 0;

        for(int i = 0; i < N.length(); i++){
            temp = (temp * 10 + (N.charAt(i) - '0')) % 20000303;
        }

        System.out.println(temp);
    }
}
