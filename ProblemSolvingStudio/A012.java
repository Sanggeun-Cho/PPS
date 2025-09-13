import java.util.ArrayList;
import java.util.List;

public class A012 {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(countPrimes(n));
    }

    public static int countPrimes(int n) {
        List<Integer> primeNums = new ArrayList<>();
        
        if(n < 2) return 0;
        else primeNums.add(2);

        for(int i = 3; i < n; i++){
            boolean prime = true;
            for(int j = 2; j * j < i; j++){
                if(i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if(prime) primeNums.add(i); 
        }

        return primeNums.size();
    }
}
