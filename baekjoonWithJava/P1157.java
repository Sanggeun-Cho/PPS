import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();

        int[] alphabet = new int[26];

        for(int i = 0; i < str.length(); i++){
            alphabet[str.charAt(i) - 'A']++;
        }

        int max = Integer.MIN_VALUE;
        char maxChar = '?';
        for(int i = 0; i < 26; i++){
            if(alphabet[i] > max){
                max = alphabet[i];
                maxChar = (char)(i + 'A');
            } else if(alphabet[i] == max){
                maxChar = '?';
            }
        }

        System.out.println(maxChar);
    }
}
