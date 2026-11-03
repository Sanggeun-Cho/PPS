public class P120864 {
    public static int solution(String my_string) {
        int answer = 0;

        int temp = 0;
        for(char c : my_string.toCharArray()){
            if(c >= '0' && c <= '9'){
                temp = temp * 10 + (c - '0');
            } else {
                answer += temp;
                temp = 0;
            }
        }

        if(temp > 0) answer += temp;

        return answer;
    }
}
