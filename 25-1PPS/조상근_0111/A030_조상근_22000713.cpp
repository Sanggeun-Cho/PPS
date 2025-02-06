// https://www.acmicpc.net/problem/17210

#include <iostream>
#include <vector>

using namespace std;

// 틀리는 이유를 모르겠음

vector<int> solution(int N, int mood, vector<double> prob){
    double good;
    double bad;
    // ChatGPT 참고
    // 처음 mood의 상태를 보고 첫 good과 bad 설정
    if(mood == 0){
        good = prob[0];
        bad = prob[1];
    }
    else {
        good = prob[2];
        bad = prob[3];
    }

    // N - 1번 반복하며 good -> good + bad -> good | good -> bad + bad -> bad 계산
    for(int i = 0; i < N - 1; i++){
        double next_good = good * prob[0] + good * prob[2];
        double next_bad = bad * prob[1] + bad * prob[3];
        good = next_good;
        bad = next_bad;
    }

    vector<int> answer;
    answer.push_back(good * 1000);
    answer.push_back(bad * 1000);

    return answer;
}

int main(){
    int N;
    int mood;
    double temp;
    vector<double> prob;

    cin >> N >> mood;
    for(int i = 0; i < 4; i++){
        cin >> temp;
        prob.push_back(temp);
    }

    vector<int> answer = solution(N, mood, prob);

    for(int i = 0; i < answer.size(); i++){
        cout << answer[i] << endl;
    }

    return 0;
}