import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class B104 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Set<Integer> cards = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            cards.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < M; i++){
            if(cards.contains(Integer.parseInt(st.nextToken()))) answer.append(1).append(' ');
            else answer.append(0).append(' ');
        }

        System.out.println(answer.toString().trim());
    }
}
