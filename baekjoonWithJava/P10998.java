import java.util.Scanner;

public class P10998 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt();
        int B = s.nextInt();

        int answer = multiple(A, B);

        System.out.println(answer);
    }

    private static int multiple(int A, int B){
        if (B == 0) return 0;
        return A + multiple(A, B - 1);
    }
}
