import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class A156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int numOfTrees = Integer.parseInt(st.nextToken());
        int neededSumOfLength = Integer.parseInt(st.nextToken());

        List<Integer> trees = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < numOfTrees; i++){
            trees.add(Integer.parseInt(st.nextToken()));
        }

        int left = 0;
        int right = Collections.max(trees);
        int answer = 0;

        while(left <= right){
            int mid = (left + right) / 2;
            int sum = 0;
            for(int each : trees){
                if (each > mid) sum += each - mid;
            }

            if(sum >= neededSumOfLength){
                answer = mid;
                left = mid + 1;
            } else {
                right = mid -1 ;
            }
        }

        System.out.println(answer);
    }
}
