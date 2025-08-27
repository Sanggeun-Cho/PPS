import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2908 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n1 = st.nextToken();
        String n2 = st.nextToken();

        String n1Reverse = new StringBuilder(n1).reverse().toString();
        String n2Reverse = new StringBuilder(n2).reverse().toString();

        String result = (Integer.parseInt(n1Reverse) > Integer.parseInt(n2Reverse)) ? n1Reverse : n2Reverse;
    
        System.out.println(result);
    }
}
