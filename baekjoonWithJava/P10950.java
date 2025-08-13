import java.util.Scanner;

public class P10950 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int count = s.nextInt();

        for(int i = 0 ; i < count; i++){
            int A = s.nextInt();
            int B = s.nextInt();

            System.out.println(A + B);
        }
    }
}
