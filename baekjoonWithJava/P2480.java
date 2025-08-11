import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P2480 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Integer[] dice = new Integer[3];

        for(int i = 0; i < 3; i++){
            dice[i] = s.nextInt();
        }

        Arrays.sort(dice, Collections.reverseOrder());

        if(dice[0].equals(dice[2])){
            System.out.println(10000 + dice[0] * 1000);
        } else if(dice[0].equals(dice[1]) || dice[1].equals(dice[2])){
            System.out.println(1000 + dice[1] * 100);
        } else {
            System.out.println(dice[0] * 100);
        }
    }
}
