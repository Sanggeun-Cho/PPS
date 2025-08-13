import java.util.Scanner;

public class P25314{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int bytes = s.nextInt();
        int changeToCount = bytes % 4 == 0 ? bytes / 4 : bytes / 4 + 1;

        for(int i = 0; i < changeToCount; i++){
            System.out.print("long ");
        }

        System.out.println("int");
    }
}