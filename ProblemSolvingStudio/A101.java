import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class A101 {
    public static void main(String[] args) {
        int[] aliceSizes = {1, 2};
        int[] bobSizes = {2, 3};

        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes){
        int sumA = 0, sumB = 0;
        for(int a : aliceSizes) sumA += a;
        
        Set<Integer> bobSet = new HashSet<>();
        for(int b : bobSizes){
            sumB += b;
            bobSet.add(b);
        }

        int diff = (sumA - sumB) / 2;

        for(int x : aliceSizes){
            int y = x - diff;
            if(bobSet.contains(y)) return new int[] {x, y}; 
        }
        
        return new int[0];
    }
}
