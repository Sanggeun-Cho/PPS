// https://www.acmicpc.net/problem/2822

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

bool checkin(vector<int> array, int num){
    for(int i = 0; i < array.size(); i++){
        if(num == array[i]) return true;
    }
    return false;
}

void solution(vector<int> scores){
    // 정수 벡터를 하나 복사
    // 벡터를 내림차순 정렬하여 5개 이후로는 지운다
    // 그 벡터의 합을 구함
    // 원래 벡터에서 새로운 벡터 내에 포함된 수의 index를 저장

    vector<int> copy;
    for(int i = 0; i < scores.size(); i++){
        copy.push_back(scores[i]);
    }
    sort(copy.begin(), copy.end(), greater<>());
    for(int i = 0; i < 3; i++){
        copy.pop_back();
    }
    int total = 0;
    for(int i = 0; i < 5; i++){
        total += copy[i];
    }
    vector<int> index;
    for(int i = 0; i < scores.size(); i++){
        if(checkin(copy, scores[i])) index.push_back(i + 1);
    }

    cout << total << "\n";
    for(int i = 0; i < 5; i++){
        cout << index[i] << " ";
    }
}

int main(){
    vector<int> scores;

    int temp;

    for(int i = 0; i < 8; i++){
        cin >> temp;
        scores.push_back(temp);
    }

    solution(scores);

    return 0;
}