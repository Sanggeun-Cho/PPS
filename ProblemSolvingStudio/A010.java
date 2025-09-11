public class A010 {
    public static void main(String[] args) {
        String s = "aabbaccc";

        System.out.println(solution(s));
    }

    public static int solution(String s){
        int n = s.length();

        if(n == 1) return 1;

        int min = n;

        for(int charSet = 1; charSet <= n / 2; charSet++){
            StringBuilder sb = new StringBuilder();

            int cnt = 1;
            for(int i = 0; i < n; i += charSet){
                int next = i + charSet;

                String cur = s.substring(i, Math.min(i + charSet, n));

                if(next + charSet <= n){
                    String nxt = s.substring(next, next + charSet);
                    if(cur.equals(nxt)) {
                        cnt++;
                        continue;
                    }
                }

                if(cnt > 1) sb.append(cnt);
                sb.append(cur);

                cnt = 1;
            }

            min = Math.min(min, sb.length());
        }

        return min;
    }
}
