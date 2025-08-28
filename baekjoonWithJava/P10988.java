import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String reverseStr = new StringBuilder(str).reverse().toString();

        if(str.equals(reverseStr)) System.out.println(1);
        else System.out.println(0);
    }
}
