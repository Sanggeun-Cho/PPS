import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class A011 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        System.out.println(Arrays.toString(solution(N, stages)));
    }

    public static int[] solution(int N, int[] stages){
        int[] reach = new int[N];
        int[] fail = new int[N];

        for(int i : stages){
            for(int j = 0; j < i; j++){
                if(j < N) reach[j]++;
            }
            if(i >= 1 && i <= N) fail[i - 1]++;
        }

        Map<Integer, Float> ratesMap = new HashMap<>();

        for(int i = 0; i < N; i++){
            Integer stage = i + 1;
            float rate = (reach[i] == 0) ? 0f : (float) fail[i] / (float) reach[i];
            
            ratesMap.put(stage, rate);
        }

        List<Map.Entry<Integer, Float>> entryList = new ArrayList<>(ratesMap.entrySet());
        entryList.sort((a, b) -> {
            int cmp = Float.compare(b.getValue(), a.getValue());
            if (cmp != 0) return cmp;
            return Integer.compare(a.getKey(), b.getKey());
        });

        int[] answer = new int[N];
        for(int i = 0; i < N; i++) answer[i] = entryList.get(i).getKey();

        return answer;
    }
}
