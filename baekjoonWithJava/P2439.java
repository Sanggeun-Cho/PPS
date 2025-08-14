import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2439 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int layer = Integer.parseInt(br.readLine());

        for(int i = 0; i < layer; i++){
            for (int j = 0; j < layer - i - 1; j++){
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}