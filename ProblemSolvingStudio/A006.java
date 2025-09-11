import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A006 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(solution(str));
    }

    static boolean solution(String s){
        int pCount = 0;
        int yCount = 0;

        s = s.toLowerCase();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p') pCount++;
            else if(s.charAt(i) == 'y') yCount++;
        }

        boolean answer = false;

        if(pCount == yCount) answer = true;

        return answer;
    }
}
