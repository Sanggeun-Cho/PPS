import java.util.*;
import java.io.*;

public class P1928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            String bit = "";
            for(char c : str.toCharArray()){
                bit += TableTo6bit(c);
            }

            String answer = "";
            for(int index = 0; index < (bit.length() - 7); index += 8){
                answer += BitToChar(bit.substring(index, index + 8));
            }

            System.out.println("#" + (i + 1) + " " + answer);
        }
    }

    public static String TableTo6bit(char c){
        int[] array = {32, 16, 8, 4, 2, 1};

        int num = 0;
        if(c >= 'A' && c <= 'Z') num = c - 'A';
        if(c >= 'a' && c <= 'z') num = c - 'A' - 6;
        if(c >= '0' && c <= '9') num = c + 4;
        if(c == '+') num = 62;
        if(c == '/') num = 63;

        String answer = "";

        for(int i : array){
            if(num >= i){
                answer += "1";
                num -= i;
            } else answer += "0";
        }

        return answer;
    }

    public static char BitToChar(String str){
        int[] array = {128, 64, 32, 16, 8, 4, 2, 1};
        int num = 0;
        for(int i = 0; i < 8; i++){
            if(str.charAt(i) == '1')num += array[i];
        }

        System.out.println(num);

        return (char) num;
    }
}