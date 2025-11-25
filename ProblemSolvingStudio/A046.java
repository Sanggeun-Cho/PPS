import java.io.*;
import java.util.*;

public class A046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] cnt = new int[26];
        for(int i = 0; i < N; i++){
            String input = br.readLine();

            cnt[input.charAt(0) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 26; i++){
            if(cnt[i] >= 5){
                sb.append((char) (i + 'a'));
            }
        }

        if(sb.length() == 0) System.out.println("PREDAJA");
        else System.out.println(sb);
    }
}
