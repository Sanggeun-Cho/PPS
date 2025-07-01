import java.util.Scanner;

public class P10869 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int A = s.nextInt();
        int B = s.nextInt();

        System.out.println(Add(A, B));
        System.out.println(Sub(A, B));
        System.out.println(Mul(A, B));
        System.out.println(Div(A, B));
        System.out.println(Rem(A, B));
    }

    private static int Add(int A, int B){
        return A + B;
    }
    
    private static int Sub(int A, int B){
        return A - B;
    }

    private static int Mul(int A, int B){
        return A * B;
    } 
    
    private static int Div(int A, int B){
        return A / B;
    }

    private static int Rem(int A, int B){
        return A % B;
    }
}
