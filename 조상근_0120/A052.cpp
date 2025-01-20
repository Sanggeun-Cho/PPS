// https://www.acmicpc.net/problem/8958

#include <iostream>
#include <string>

using namespace std;

int solution(string s){
    // 정답이면 점수를 더하고 해당 점수를 ++
    // 오답이면 점수를 1로 리셋
    int total = 0;
    int score = 1;
    for(int i = 0; i < s.length(); i++){
        if(s[i] == 'O') {
            total += score;
            score++;
        }
        if(s[i] == 'X') score = 1;
    }
    
    return total;
}

int main(){
    string s;
    int num;

    cin >> num;
    for(int i = 0; i < num; i++){
        cin >> s;
        cout << solution(s) << endl;
    }

    return 0;
}