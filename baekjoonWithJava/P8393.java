import java.util.Scanner;

public class P8393{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int totalSum = 0;

        for(int i = 1; i <= n; i++){
            totalSum += i;
        }

        System.out.println(totalSum);
    }
}