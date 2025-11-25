import java.io.*;
import java.util.*;

public class A034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Set<Integer> mod = new HashSet<>();
        for(int i = 0; i < 10; i++){
            mod.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.println(mod.size());
    }
}
