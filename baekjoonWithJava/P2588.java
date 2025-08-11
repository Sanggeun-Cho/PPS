import java.util.Scanner;

public class P2588 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int firstNum = s.nextInt();
        int secondNum = s.nextInt();

        int[] place = new int[3];

        for (int i = 0; i < 3; i++){
            place[i] = secondNum % 10;
            secondNum /= 10;
        }

        System.out.println(firstNum * place[0]);
        System.out.println(firstNum * place[1]);
        System.out.println(firstNum * place[2]);

        System.out.println(firstNum * place[0] + (firstNum * place[1] * 10) + (firstNum * place[2] * 100));
    }
}
