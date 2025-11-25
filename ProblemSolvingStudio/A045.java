import java.io.*;
import java.util.*;

public class A045 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        input = input.toUpperCase();

        int[] cnt = new int[26];

        int max = 0;
        for(char c : input.toCharArray()){
            int idx = c - 'A';

            cnt[idx]++;
            if(max < cnt[idx]) max = cnt[idx];
        }

        int max_idx = -1;
        for(int i = 0; i < 26; i++){
            if(cnt[i] == max && max_idx != -1){
                max_idx = -1;
                break;
            }
            if(cnt[i] == max) {
                max_idx = i;
            }
        }
        
        if(max_idx == -1) System.out.println('?');
        else System.out.println((char)(max_idx + 'A'));
    }
}
