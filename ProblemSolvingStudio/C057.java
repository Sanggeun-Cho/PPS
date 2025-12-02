import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Set<String> arr = new HashSet<>();

        for(int i = 0; i < N; i++){
            arr.add(br.readLine());
        }

        List<String> listArr = new ArrayList<>();
        for(String each : arr){
            listArr.add(each);
        }

        listArr.sort((s1, s2) -> {
            if(s1.length() != s2.length()){
                return s1.length() - s2.length();
            }

            return s1.compareTo(s2);
        });

        StringBuilder sb = new StringBuilder();
        for(String each : listArr){
            sb.append(each).append('\n');
        }

        System.out.println(sb);
    }
}
