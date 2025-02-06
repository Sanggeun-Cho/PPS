// https://school.programmers.co.kr/learn/courses/30/lessons/42747

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> citations){
    // 배열 내림차순 정렬
    // 배열의 숫자와 해당 index + 1이 동일하면 그 값을 리턴
    
    sort(citations.begin(), citations.end(), greater<>());

    int answer;
    for(int i = 0; i < citations.size(); i++){
        if(citations[i] == i + 1) answer = i + 1;
    }

    return answer;
}

int main(){
    vector<int> citations = {3, 0, 6, 1, 5};

    cout << solution(citations) << endl;

    return 0;
}