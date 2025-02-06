// https://www.acmicpc.net/problem/10757

#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

// 블로그 참조 -> 주석을 적고 직접 모방 구현
// https://carrot-farmer.tistory.com/41

string solution(string A, string B){
    // 큰 수로 자릿수 맞추기
    int maxLen = max(A.length(), B.length());
    A = string(maxLen - A.length(), '0') + A;
    B = string(maxLen - B.length(), '0') + B;
    
    // 각 자릿수 계산 (int)
    // 올림 계산
    // 자리수를 결과에 더함 (string)
    int temp; // 각 자리수
    int carry = 0; // 올림 처리
    string sum; // 계산 값(역순)
    for(int i = maxLen - 1; i >= 0; i--){
        temp = (A[i] - '0') + (B[i] - '0') + carry;
        carry = temp / 10;
        sum += ((temp % 10) + '0');
    }

    // 남아있는 올림 값이 있다면 처리
    if(carry > 0) sum += (carry + '0');

    // 뒤집어서 출력
    reverse(sum.begin(), sum.end());

    return sum;
}

int main(){
    string A;
    string B;

    cin >> A >> B;

    cout << solution(A, B) << endl;

    return 0;
}