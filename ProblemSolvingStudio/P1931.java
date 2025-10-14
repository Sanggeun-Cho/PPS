import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class P1931 {
    public static class Time {
        int start;
        int end;

        Time(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Time> times = new ArrayList<>();

        for(int i = 0 ; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            times.add(new Time(start, end));
        }

        times.sort(
            Comparator.comparingInt((Time t) -> t.start)
            .thenComparing(t -> t.end)
        );

        int lastTime = 0;
        int cnt = 0;

        for(Time each : times){
            if(each.end < lastTime){
                lastTime = each.end;
            } else if(each.start >= lastTime){
                cnt++;
                lastTime = each.end;
            }
        }

        System.out.println(cnt);
    }
}
