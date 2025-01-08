// https://school.programmers.co.kr/learn/courses/30/lessons/42889

#include <iostream>
#include <string>
#include <vector>

using namespace std;

bool checkin(vector<int> array, int index){
    bool check = true;
    for(int i = 0; i < array.size(); i++){
        if(index == array[i]) check = false;
    }
    
    return check;
}

vector<int> solution(int N, vector<int> stages){
    vector<int> answer;

    // 스테이지 개수 만큼 반복문
    
    vector<double> failure;

    for(int i = 1; i <= N; i++){
        int fail_cnt = 0;
        int try_cnt = 0;
        // 각 스테이지 마다 stages를 둘러보며 숫자가 같은 사람은 실패한 사람 수, 숫자가 더 큰 사람은 시도한 사람 수
        // 실패율 구해서 배열에 저장
        for(int j = 0; j < stages.size(); j++){
            if(i == stages[j]) fail_cnt++; 
            if(i <= stages[j]) try_cnt++;
        }
        failure.push_back((fail_cnt * 1.0) / (try_cnt * 1.0));
    }

    // 스테이지 개수만큼 반복문을 돌리며 가장 큰 수와 함께 그 인덱스를 배열에 추가
    // 배열에 있는 수와 같지 않은 수들로 다시 가장 큰 수 고르기
    int index;
    while(answer.size() < N){
        double max = -1.0;
        for(int i = 0; i < N; i++){
            if(max < failure[i] && checkin(answer, i)){
                max = failure[i];
                index = i;
            }
        }
        answer.push_back(index);
    }

    // 스테이지에 맞게 나오도록 index 값들에 +1
    for(int i = 0; i < N; i++){
        answer[i]++;
    }
    
    return answer;
}

int main(){
    int N = 4;
    vector<int> stages = {2, 1, 2, 6, 2, 4, 3, 3};

    vector<int> answer = solution(N, stages);

    cout << "[";
    for(int i = 0; i < N; i++){
        cout << answer[i];
        if(i < N - 1) cout << ", ";
    }
    cout << "]" << endl;

    return 0;
}