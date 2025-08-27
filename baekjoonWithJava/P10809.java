import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int[] alphabets = new int[26];
        Arrays.fill(alphabets, -1);

        for(int i = 0; i < str.length(); i++){
            if(alphabets[str.charAt(i) - 'a'] == -1){
                alphabets[str.charAt(i) - 'a'] = i;
            }
        }

        StringBuilder sb = new StringBuilder(1 >> 20);
        for(int i : alphabets){
            sb.append(i).append(" ");
        }

        System.out.println(sb.toString());
    }
}
