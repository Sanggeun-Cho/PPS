public class P120812 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 4};

        System.out.println(solution(array));
    }

    public static int solution(int[] array) {
        int[] count = new int[1001];
        int max = 0;
        int maxNum = 0;
        
        for(int i = 0; i < array.length; i++){
            int num = array[i];
            count[num]++;
            
            if(max < count[num]){
                max = count[num];
                maxNum = num;
            }
        }
        
        for(int i = 1; i < 1001; i++){
            if(i != maxNum && max == count[i]) return -1;
        }
        
        return maxNum;
    }
}