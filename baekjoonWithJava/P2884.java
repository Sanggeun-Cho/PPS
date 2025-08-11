import java.util.Scanner;

public class P2884 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int H = s.nextInt();
        int M = s.nextInt();

        if(M >= 45) {
            M -= 45;
        } else if(H != 0){
            H -= 1;
            M += 15;
        } else {
            H = 23;
            M += 15;
        }

        System.out.println(H + " " + M);
    }
}
