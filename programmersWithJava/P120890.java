import java.util.*;

public class P120890 {
    public static int solution(int[] array, int n){
        Arrays.sort(array);
        
        int answer = 0;
        int min = Integer.MAX_VALUE;

        for(int num : array) {
            int diff = num - n;
            if(diff < 0) diff *= -1;

            if(diff < min) {
                min = diff;
                answer = num;
            }
        }

        return answer;
    }
}