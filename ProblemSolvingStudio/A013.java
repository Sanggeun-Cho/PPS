import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A013 {
    public static void main(String[] args) throws IOException {
        int[] nums = {4, 1, 2, 1, 2};

        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums){
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i += 2){
            if(i == nums.length - 1 || nums[i] != nums[i + 1]) return nums[i];
        }

        return -1;
    }
}
