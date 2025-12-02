import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class A048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i = 0; i < N; i++){
            Set<Character> set = new HashSet<>();

            String str = br.readLine();

            boolean state = true;

            for(int j = 0; j < str.length(); j++){
                char each = str.charAt(j);
                char afterChar;
                if(j < str.length() - 1) afterChar = str.charAt(j + 1);
                else afterChar = '0';

                if(set.contains(each)) {
                    state = false;
                    break;
                }
                if(each != afterChar){
                    set.add(each);
                }
            }

            if(state) answer++;
        }

        System.out.println(answer);
    }
}
