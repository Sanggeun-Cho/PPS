import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean ascending = true;
        boolean descending = true;

        for(int i = 0; i < 8; i++){
            int piano = Integer.parseInt(st.nextToken());

            if(piano != i + 1) ascending = false;
            if(piano != 8 - i) descending = false;
        }

        if(ascending) System.out.println("ascending");
        else if(descending) System.out.println("descending");
        else System.out.println("mixed");
    }
}
