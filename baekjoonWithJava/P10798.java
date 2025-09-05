import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[5];
        int maxLen = 0;

        for(int i = 0; i < 5; i++){
            arr[i] = br.readLine();
            if(maxLen < arr[i].length()) maxLen = arr[i].length();
        }

        StringBuilder sb = new StringBuilder();

        for(int col = 0; col < maxLen; col++){
            for(int row = 0; row < 5; row++){
                if(col < arr[row].length()){
                    sb.append(arr[row].charAt(col));
                }
            }
        }

        System.out.println(sb);
    }
}
