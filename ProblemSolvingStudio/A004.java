import java.util.ArrayList;
import java.util.Arrays;

public class A004 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        System.out.println(Arrays.toString(solution(arr, divisor)));
    }

    public static int[] solution(int[] arr, int divisor){
        ArrayList<Integer> element = new ArrayList<>();

        for(int i : arr){
            if(i % divisor == 0) element.add(i);
        }

        if (element.isEmpty()) {
            return new int[] {-1};
        }

        int[] answer = new int[element.size()];
        for (int i = 0; i < element.size(); i++) {
            answer[i] = element.get(i);
        }

        Arrays.sort(answer);
        
        return answer;
    }
}
