import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P30402 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 15; i++){
            String line = br.readLine();
            for(char c : line.toCharArray()){
                if(c == 'w') {
                    System.out.println("chunbae");
                    return;
                } else if(c == 'b') {
                    System.out.println("nabi");
                    return;
                } else if(c == 'g') {
                    System.out.println("yeongcheol");
                    return;
                }
            }
        }
    }
}
