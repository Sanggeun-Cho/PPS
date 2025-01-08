// https://www.acmicpc.net/problem/2577

#include <iostream>
#include <vector>

using namespace std;

vector<int> solution(int A, int B, int C){
    // 세 수를 곱하기
    int num = A * B * C;

    // 결과 값을 10으로 나누며 그 나머지를 배열에 저장
    vector<int> nums;
    int temp;
    while(num >= 1){
        temp = num % 10;
        nums.push_back(temp);
        num /= 10;
    }

    // 숫자 별로 개수를 세는 배열을 만들어 해당 숫자가 나오면 개수 카운트
    vector<int> num_cnt = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    for(int i = 0; i < nums.size(); i++){
        num_cnt[nums[i]]++;
    }

    return num_cnt;
}

int main(){
    int A;
    int B;
    int C;

    cin >> A;
    cin >> B;
    cin >> C;

    vector<int> answer = solution(A, B, C);

    for(int i = 0; i < answer.size(); i++){
        cout << answer[i] << endl;
    }

    return 0;
}