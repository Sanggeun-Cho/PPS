import java.io.*;
import java.util.*;

public class goorm3_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int total = 0;
        int idx = K - 1;

        while (list.size() > 1) {
            int leftDist = 200000;
            if(idx > 0) leftDist = list.get(idx) - list.get(idx - 1);
            int rightDist = 200000;
            if(idx < list.size() - 1) rightDist = list.get(idx + 1) - list.get(idx);

            if(leftDist < rightDist) {
                total += leftDist;
                list.remove(idx);
                idx--;
            } else {
                total += rightDist;
                list.remove(idx);
            }
        }

        System.out.println(total);
    }
}
