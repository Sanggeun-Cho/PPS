import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A155 {
    public static void main(String[] args) throws IOException {
        // Long으로 안해서 테스트케이스 미통과

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long[] LANs = new long[K];
        long max = 0;
        for(int i = 0; i < K; i++){
            LANs[i] = Integer.parseInt(br.readLine());
            if(LANs[i] > max) max = LANs[i];
        }

        Arrays.sort(LANs);

        long left = 1;
        long right = max;

        while(left <= right){
            long mid = (left + right) / 2;
            long sum = 0;

            for(long each : LANs){
                sum += (each / mid);
            }

            if(sum >= N) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(right);
    }
}

/*
import java.io.*;
import java.util.*;

public class Main {
    static int K, N;
    static long left = 1, right = Integer.MIN_VALUE;
    static int[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[K];

        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            right = Math.max(right, arr[i]);
        }

        parametricSearch();

        br.close();
    }
    static void parametricSearch() {
        while (left <= right) {
            long mid = (left + right) / 2;
            long LAN = 0;
            for (int i = 0; i < arr.length; i++) {
                LAN += (arr[i] / mid);
            }
            if (LAN>=N){
                left = mid + 1;
            } else if (LAN < N) {
                right = mid - 1;
            }
        }
        System.out.println(right);
    }
}
 */