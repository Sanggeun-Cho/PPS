import java.util.*;
import java.io.*;

public class P1945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            int num = Integer.parseInt(br.readLine());
            int[] answer = new int[5];

            while(num > 1){
                if(num % 2 == 0){
                    num /= 2;
                    answer[0]++;
                } else if(num % 3 == 0){
                    num /= 3;
                    answer[1]++;
                } else if(num % 5 == 0){
                    num /= 5;
                    answer[2]++;
                } else if(num % 7 == 0){
                    num /= 7;
                    answer[3]++;
                } else if(num % 11 == 0){
                    num /= 11;
                    answer[4]++;
                }
            }

            System.out.print("#" + (i + 1) + " ");
            for(int n : answer){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}