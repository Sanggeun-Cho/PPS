// https://school.programmers.co.kr/learn/courses/30/lessons/42885

#include <iostream>
#include <vector>

using namespace std;

bool checkin(vector<int> array, int index){
    bool check = true;
    for(int i = 0; i < array.size(); i++){
        if(index == array[i]) check = false;
    }

    // 속하지 않았을 때 true 반환
    return check;
}

int solution(vector<int> people, int limit){
    vector<int> saved;
    int p_id;
    int p2_id;
    int boat = 0;

    // 반복문으로 배의 수를 +1, 첫 사람과 배를 탈 수 있는 사람 정하기
    for(int i = 0; i < people.size(); i++){
        if(!(checkin(saved, i))) continue;
        boat++;
        p_id = i;
        saved.push_back(i);
        for(int j = i + 1; j < people.size(); j++){
            // 배열에 속해있지 않은 사람들 중에서 첫 사람과 배를 탈 사람 정함
            if(people[p_id] + people[j] <= limit && checkin(saved, j)){
                p2_id = j;
                // 배를 탄 사람의 인덱스를 배열에 저장
                saved.push_back(j);
                continue;
            }
        }
    }

    return boat;
}

int main(){
    vector<int> people = {70, 50, 50, 30};
    int limit = 100;

    cout << solution(people, limit) << endl;

    return 0;
}