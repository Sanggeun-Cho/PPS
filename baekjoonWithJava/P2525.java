import java.util.Scanner;

public class P2525 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int H = s.nextInt();
        int M = s.nextInt();
        int cookTime = s.nextInt();

        if(M + cookTime >= 60){
            H = H + ((M + cookTime) / 60);
            if(H > 23) H -= 24;
            M = M + cookTime - (60 * ((M + cookTime) / 60));
        } else {
            M += cookTime;
        }

        System.out.println(H + " " + M);
    }
}
