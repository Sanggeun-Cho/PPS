// https://school.programmers.co.kr/learn/courses/30/lessons/64061

#include <iostream>
#include <vector>
#include <string>

using namespace std;

int solution(vector<vector<int>> board, vector<int> moves){
    for(int i = 0; i < moves.size(); i++){
        moves[i]--;
    }
    // moves의 순서에 맞춰 크레인이 내려감
        // 숫자가 0이라면 그 다음 칸으로 넘어감
        // 숫자가 있다면 그 숫자를 새로운 벡터로 push하고 수를 0으로 바꿈, continue;
    vector<int> pulled;
    int erased = 0;
    for(int i = 0; i < moves.size(); i++){
        for(int j = 0; j < board.size(); j++){
            if(board[j][moves[i]] != 0){
                pulled.push_back(board[j][moves[i]]);
                board[j][moves[i]] = 0;
                break;
            }
        }
        // 연속되는 곳이 있으면 += 2하고 한칸을 넘어감
        if(pulled.size() > 1 && pulled[pulled.size() - 1] == pulled[pulled.size() - 2]){
            pulled.pop_back();
            pulled.pop_back();
            erased += 2;
        }
    }

    return erased;
}

int main(){
    vector<vector<int>> board = {{0, 0, 0, 0, 0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
    vector<int> moves = {1, 5, 3, 5, 1, 2, 1, 4};
    
    cout << solution(board, moves) << endl;

    return 0;
}