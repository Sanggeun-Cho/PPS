import java.util.Scanner;

public class P11382 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long totalSum = 0;
        for(int i = 0; i < 3; i++){
            long num = s.nextInt();
            totalSum += num;
        }

        System.out.println(totalSum);
    }
}
