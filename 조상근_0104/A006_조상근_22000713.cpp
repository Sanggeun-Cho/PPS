// https://school.programmers.co.kr/learn/courses/30/lessons/12916

#include <iostream>
#include <vector>
#include <string>

using namespace std;

bool solution(string s){
    // 문자열을 읽으며 p&P의 개수와 y&Y의 개수 카운트
    int p_cnt = 0;
    int y_cnt = 0;

    for(int i = 0; i < s.size(); i++){
        if(s[i] == 'p' || s[i] == 'P') p_cnt++;
        if(s[i] == 'y' || s[i] == 'Y') y_cnt++;
    }

    // 같으면 true, 틀리면 false 반환
    if(p_cnt == y_cnt) return true;
    else return false;
}

int main(){
    string s = "pPoooyY";

    if(solution(s)) cout << "true" << endl;
    else cout << "false" << endl;

    return 0;
}