import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P28290 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        if(line.equals("fdsajkl;") || line.equals("jkl;fdsa")){
            System.out.println("in-out");
        } else if(line.equals("asdf;lkj") || line.equals(";lkjasdf")){
            System.out.println("out-in");
        } else if(line.equals("asdfjkl;;")){
            System.out.println("stairs");
        } else if(line.equals(";lkjfdsa")){
            System.out.println("reverse");
        } else {
            System.out.println("molu");
        }
    }
}
