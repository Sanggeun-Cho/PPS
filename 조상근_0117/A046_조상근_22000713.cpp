// https://www.acmicpc.net/problem/1159

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

string solution(vector<string> players){
    string answer;
    // 선수들의 첫 글자에 맞는 알파벳의 개수를 센다
    vector<int> alphabet(26);
    for(int i = 0; i < players.size(); i++){
        int first = players[i][0] - 'a';
        alphabet[first]++;
    }

    // 알파벳의 수가 5 이상이면 push
    for(int i = 0; i < 26; i++){
        if(alphabet[i] >= 5) answer.push_back(i + 'a');
    }

    if(answer.length() == 0) return "PREDAJA";
    else return answer;
}

int main(){
    int num;

    cin >> num;

    string player;
    vector<string> players;

    for(int i = 0; i < num; i++){
        cin >> player;
        players.push_back(player);
    }

    cout << solution(players) << endl;

    return 0;
}