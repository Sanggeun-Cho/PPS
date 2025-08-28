import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P1316 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int wordCnt = 0;

        for(int i = 0; i < count; i++){
            String str = br.readLine();
            List<Character> existChar= new ArrayList<>();
            int state = 0;

            for(int j = 0; j < str.length(); j++){
                char ch = str.charAt(j);
                
                if(checkExistChar(ch, existChar)){
                    state = 1;
                    break;
                } else {
                    if(j < str.length() -1 && ch != str.charAt(j + 1)) existChar.add(ch);
                }
            }

            if(state == 0) wordCnt++;
        }

        System.out.println(wordCnt);
    }

    private static boolean checkExistChar(char ch, List<Character> list){
        for(char check : list){
            if(check == ch) return true;
        }
        return false;
    }
}
