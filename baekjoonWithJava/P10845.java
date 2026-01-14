import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("push")){
                int num = Integer.parseInt(st.nextToken());

                arr.add(num);
            } else if(command.equals("pop")){
                if(arr.isEmpty()) {
                    System.out.println(-1);
                    continue;
                }
                System.out.println(arr.get(0));
                arr.remove(0);
            } else if(command.equals("size")){
                System.out.println(arr.size());
            } else if(command.equals("empty")){
                System.out.println(arr.isEmpty() ? 1 : 0);
            } else if(command.equals("front")){
                if(arr.isEmpty()) {
                    System.out.println(-1);
                    continue;
                }
                System.out.println(arr.get(0));
            } else if(command.equals("back")){
                if(arr.isEmpty()) {
                    System.out.println(-1);
                    continue;
                }
                System.out.println(arr.get(arr.size() - 1));
            }
        }
    }
}
