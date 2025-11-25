import java.io.*;
import java.util.*;

public class goorm3 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken()); // 시작 고깔 번호 (1-based)

        if (N == 0) { // 고깔이 없다면 이동 거리 0
            System.out.println(0);
            return;
        }

        long[] pos = new long[N];

        int idx = 0;
        while (idx < N) {
            if (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            pos[idx++] = Long.parseLong(st.nextToken());
        }

        long startPos = pos[K - 1]; // 시작 고깔 위치

        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            set.add(pos[i]);
        }

        // 시작 고깔은 이미 주운 상태
        set.remove(startPos);

        long cur = startPos;
        long totalDist = 0L;

        while (!set.isEmpty()) {
            Long left = set.lower(cur);   // cur보다 작은 값 중 가장 큰 값
            Long right = set.higher(cur); // cur보다 큰 값 중 가장 작은 값

            if (left == null && right == null) {
                break; // 남은 고깔 없음
            }

            long next;

            if (left == null) {
                // 왼쪽 없음 → 오른쪽으로만 갈 수 있음
                next = right;
            } else if (right == null) {
                // 오른쪽 없음 → 왼쪽으로만 갈 수 있음
                next = left;
            } else {
                long distL = Math.abs(cur - left);
                long distR = Math.abs(right - cur);

                if (distL < distR) {
                    next = left;
                } else if (distL > distR) {
                    next = right;
                } else {
                    // 거리 같음 → 0에서 더 먼 고깔 선택
                    long d0L = Math.abs(left);
                    long d0R = Math.abs(right);

                    if (d0L > d0R) {
                        next = left;
                    } else if (d0L < d0R) {
                        next = right;
                    } else {
                        // 원점 기준 거리도 같다면, 그냥 더 큰 좌표 쪽으로
                        next = Math.max(left, right);
                    }
                }
            }

            totalDist += Math.abs(cur - next);
            set.remove(next);
            cur = next;
        }

        System.out.println(totalDist);
    }
}
