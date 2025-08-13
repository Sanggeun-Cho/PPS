import java.util.Scanner;

public class P25304{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int totalPrice = s.nextInt();
        int calculatePrice = 0;

        int count = s.nextInt();

        for(int i = 0; i < count; i++){
            int price = s.nextInt();
            int amount = s.nextInt();

            calculatePrice = calculatePrice + (price * amount);
        }

        System.out.println(totalPrice == calculatePrice ? "Yes" : "No");
    }
}