// https://www.acmicpc.net/problem/4344

#include <iostream>
#include <vector>

using namespace std;

double ratio(int std){
    // 학생 수 만큼 점수를 벡터에 입력 받기
    vector<int> score;
    int temp;
    for(int i = 0; i < std; i++){
        cin >> temp;
        score.push_back(temp);
    }

    // 총 점수를 학생 수로 나누어 평균 구하기
    int total = 0;
    for(int i = 0; i < std; i++){
        total += score[i];
    }
    double average = total / std;

    // 학생들의 점수를 평균과 비교하여 넘는 인원 수 세기
    int cnt = 0;
    for(int i = 0; i < std; i++){
        if(score[i] > average) cnt++;
    }

    // 평균을 넘는 학생 수 / 총 학생 수 를 백분율로 구하여 나타내기
    double ratio = cnt * 100.0 / std;

    return ratio;
}

int main(){
    // 입력할 횟수를 입력 받기
    int cnt;

    cin >> cnt;

    int std;

    for(int i = 0; i < cnt; i++){
        cin >> std;

        cout << fixed;
        cout.precision(3);

        cout << ratio(std) << "%" << endl;
    }

    return 0;
}