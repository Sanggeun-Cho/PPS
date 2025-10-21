import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B127 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();

        int index = 0;
        int stackNum = 1;

        StringBuilder sb = new StringBuilder();

        while(index < N){
            if(!stack.isEmpty() && stack.peek() == arr[index]){
                stack.pop();
                sb.append('-').append('\n');
                index++;
                continue;
            } else if(stackNum <= N) {
                stack.push(stackNum++);
                sb.append('+').append('\n');
            } else {
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println(sb);
    }
}