import java.io.BufferedReader;

public class P1110 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int newN = N;
        int cnt = 1;

        int first = newN / 10;
        int second = newN % 10;
        
        newN = (second * 10) + ((first + second) % 10);
        
        while(newN != N){
            first = newN / 10;
            second = newN % 10;
            
            newN = (second * 10) + ((first + second) % 10);
            cnt++;
        }
        
        System.out.println(cnt);
    }
}
