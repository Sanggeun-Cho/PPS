import java.util.Scanner;

public class P2753 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int year = s.nextInt();

        if(checkLeapYear(year)) System.out.println(1);
        else System.out.println(0);
    }

    public static boolean checkLeapYear(int year){
        if(((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) return true;
        else return false;
    }
}
