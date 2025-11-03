import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long N = Long.parseLong(br.readLine());

        if(N > 5){
            System.out.println("Love is open door");
        } else {
            Long door = Long.parseLong(br.readLine()); // 0 : push, 1 : pull

            for(int i = 1; i < N; i++){
                door = 1 - door;

                System.out.println(door);
            }
        }
    }
}
