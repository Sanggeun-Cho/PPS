// https://school.programmers.co.kr/learn/courses/30/lessons/12910

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr, int divisor){
    // arr 배열을 확인하며 divisor로 나누어지는 수는 answer 배열에 넣기
    vector<int> answer;
    for(int i = 0; i < arr.size(); i++){
        if(arr[i] % divisor == 0) answer.push_back(arr[i]);
    }

    // answer 배열의 길이가 0이라면 -1을 push
    if(answer.size() == 0) answer.push_back(-1);

    // 오름차순 정리
    sort(answer.begin(), answer.end());

    // answer 리턴
    return answer;
}

int main(){
    vector<int> arr = {5, 9, 7, 10};
    int divisor = 5;

    vector<int> answer = solution(arr, divisor);

    cout << "[";
    for(int i = 0; i < answer.size(); i++){
        cout << answer[i];
        if(i != answer.size() - 1) cout << ", ";
    }
    cout << "]" << endl;

    return 0;
}