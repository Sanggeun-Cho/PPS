import java.util.Scanner;

public class P14681 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int X = s.nextInt();
        int Y = s.nextInt();

        if(isProductPositive(X, Y)){
            if(X > 0) System.out.println(1);
            else System.out.println(3);
        } else {
            if(X > 0) System.out.println(4);
            else System.out.println(2);
        }
    }

    public static boolean isProductPositive(int A, int B){
        if(A * B > 0) return true;
        else return false;
    }
}
