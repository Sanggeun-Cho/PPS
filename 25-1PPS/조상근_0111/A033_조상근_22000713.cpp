// https://www.acmicpc.net/problem/2953

#include <iostream>
#include <vector>

using namespace std;

vector<int> solution(vector<vector<int>> scores){
    // 점수들을 받아 가장 큰 점수를 받은 index + 1과 그 점수 반환
    int index;
    int max = 0;
    for(int i = 0; i < 5; i++){
        int sum = 0;
        for(int j = 0; j < 4; j++){
            sum += scores[i][j];
        }
        if(max < sum) max = sum, index = i + 1;
    }
    vector<int> winner;
    winner.push_back(index);
    winner.push_back(max);

    return winner;
}

int main(){
    vector<vector<int>> scores;
    vector<int> part_score;
    int temp;
    for(int i = 0; i < 5; i++){
        part_score = {};
        for(int j = 0; j < 4; j++){
            cin >> temp;
            part_score.push_back(temp);
        }
        scores.push_back(part_score);
    }

    vector<int> answer = solution(scores);

    cout << answer[0] << " " << answer[1] << endl;
}