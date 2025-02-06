// https://school.programmers.co.kr/learn/courses/30/lessons/42748

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> array, vector<vector<int>> commands){
    // commands의 한 배열의 i에서 j까지 push
    // 그 값을 오름차순 sort
    // k번째 수를 answer에 push
    vector<int> answer;
    
    for(int index = 0; index < commands.size(); index++){
        vector<int> temp;
        for(int count = commands[index][0] - 1; count < commands[index][1]; count++){
            temp.push_back(array[count]);
        }
        sort(temp.begin(), temp.end());
        answer.push_back(temp[commands[index][2] - 1]);
    }

    return answer;
}

int main(){
    vector<int> array = {1, 5, 2, 6, 3, 7, 4};
    vector<vector<int>> commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

    vector<int> answer = solution(array, commands);

    cout << "[";
    for(int i = 0; i < answer.size(); i++){
        cout << answer[i];
        if(i < answer.size() - 1) cout << ", ";
    }
    cout << "]";

    return 0;
}