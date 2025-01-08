// https://www.acmicpc.net/problem/2455

#include <iostream>
#include <vector>

using namespace std;

int solution(vector<vector<int>> people){
    // 각 역마다 사람의 수를 계산하여 총 인원 수를 배열에 저장
    vector<int> station;
    int cnt = 0;
    for(int i = 0; i < 4; i++){
        cnt = cnt - people[i][0] + people[i][1];
        station.push_back(cnt);
    }

    // 배열 중 가장 큰 수를 리턴
    int max = 0;
    for(int i = 0; i < 4; i++){
        if(max < station[i]) max = station[i];
    }

    return max;
}

int main(){
    vector<int> person;
    vector<vector<int>> people;
    int temp;

    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 2; j++){
            cin >> temp;
            person.push_back(temp);
        }
        people.push_back(person);
        person = {};
    }

    cout << solution(people) << endl;
}