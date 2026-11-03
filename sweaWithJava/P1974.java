import java.io.*;
import java.util.*;

public class P1974 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int t = 1; t <= T; t++){
            int[][] matrix = new int[9][9];
            // 00 01 02 03 
            // 10 11 12 13

            boolean flag = true;

            

            for(int i = 0; i < 9; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j = 0; j < 9; j++){
                    matrix[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 가로
            for(int i = 0; i < 9; i++){
                Set<Integer> check = new HashSet<>();

                for(int j = 0; j < 9; j++){
                    check.add(matrix[i][j]);
                }

                if(check.size() < 9) {
                    flag = false;
                }
            }

            // 세로
            for(int i = 0; i < 9; i++){
                Set<Integer> check = new HashSet<>();
                
                for(int j = 0; j < 9; j++){
                    check.add(matrix[j][i]);
                }

                if(check.size() < 9) {
                    flag = false;
                }
            }

            // 격자
            for(int i = 0; i < 9; i += 3){
                for(int j = 0; j < 9; j += 3){
                    Set<Integer> check = new HashSet<>();

                    for(int k = 0; k < 3; k++){
                        for(int l = 0; l < 3; l++){
                            check.add(matrix[i + k][j + l]);
                        }
                    }

                    if(check.size() < 9) {
                        flag = false;
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            sb.append("#").append(t).append(" ");
            if(flag) sb.append(1);
            else sb.append(0);

            System.out.println(sb);
        }
    }
}
