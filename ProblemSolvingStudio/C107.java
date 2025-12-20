import java.io.IOException;

public class C107 {
    static int MAX = 10000;
    public static void main(String[] args) throws IOException {
        boolean[] isSelfNum = new boolean[MAX + 1];

        for(int i = 1; i <= MAX; i++){
            if(d(i) <= MAX) isSelfNum[d(i)] = true;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= MAX; i++){
            if(!isSelfNum[i]) sb.append(i).append('\n');
        }

        System.out.println(sb);
    }

    public static int d(int n){
        int sum = n;
        while(n != 0){
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }
}
