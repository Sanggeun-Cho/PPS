import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5622 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().trim();

        int totalTime = 0;

        for(int i = 0; i < str.length(); i++){
            int time = returnDialNum(str.charAt(i)) + 1;

            totalTime += time;
        }

        System.out.println(totalTime);
    }

    private static int returnDialNum(char c) {
        if (c < 'D') return 2;      // ABC
        else if (c < 'G') return 3; // DEF
        else if (c < 'J') return 4; // GHI
        else if (c < 'M') return 5; // JKL
        else if (c < 'P') return 6; // MNO
        else if (c < 'T') return 7; // PQRS
        else if (c < 'W') return 8; // TUV
        else return 9;              // WXYZ
    }
}
