// https://school.programmers.co.kr/learn/courses/30/lessons/12918

#include <iostream>
#include <string>

using namespace std;

bool solution(string s) {
    bool answer = true;

    // 문자열의 길이 확인
    if(!(s.size() == 4 || s.size() == 6)) answer = false;

    // 문자열에 영어가 들어있는지 확인
    for(int i = 0; i < s.size(); i++){
        if((s[i] >= 65 && s[i] <= 90) || (s[i] >= 97 && s[i] <= 122)) answer = false;
    }

    return answer;
}

int main(){
    string s;

    cin >> s;
    if(solution(s)) cout << "true" << endl;
    else cout << "false" << endl;

    return 0;
}