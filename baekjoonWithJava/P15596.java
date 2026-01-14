import java.io.IOException;

public class P15596 {
    public static void main(String[] args) throws IOException {
        
    }

    static long sum(int[] a) {
        long answer = 0;
        for(int i : a){
            answer += (long) i;
        }

        return answer;
    }
}
