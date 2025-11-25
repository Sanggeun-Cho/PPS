import java.io.*;
import java.util.*;

public class A033 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int index = 0;
        int max = 0;

        for(int i = 0; i < 5; i++){
            int sum = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 4; j++){
                sum += Integer.parseInt(st.nextToken());
            }

            if(sum > max){
                max = sum;
                index = i + 1;
            }
        }

        System.out.println(index + " " + max);
    }
}
