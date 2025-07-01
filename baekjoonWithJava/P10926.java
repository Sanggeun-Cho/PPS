import java.util.Scanner;

public class P10926 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String name = s.nextLine();
        
        System.out.println(surprise(name));
    }

    private static String surprise(String name){
        String surprisedName;
        surprisedName = name + "??!";

        return surprisedName;
    }
}
