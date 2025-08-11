import java.util.Scanner;

public class P10430 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();

        for(int i = 0; i < 4; i++){
            int answer;
            if(i == 0){
                answer = (A + B) % C;
            } else if(i == 1){
                answer = ((A % C) + (B % C)) % C;
            } else if(i == 2){
                answer = (A * B) % C;
            } else {
                answer = ((A % C) * (B % C)) % C;
            }

            System.out.println(answer);
        }
    }
}
