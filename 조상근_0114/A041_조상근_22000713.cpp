// https://school.programmers.co.kr/learn/courses/30/lessons/12951

#include <iostream>
#include <vector>
#include <string>

using namespace std;

string solution(string s){
    // 첫 문자열은 소문자 영어라면 대문자로 수정
    if(s[0] >= 'a' && s[0] <= 'z') s[0] -= 32;
    // 문자열을 돌며 전 배열이 공백이었다면 현재 문자는 Uppurcase
    // 공백이 아니라면 Lowercase
    for(int i = 1; i < s.size(); i++){
        if(s[i - 1] == ' ' && s[i] >= 'a' && s[i] <= 'z') s[i] -= 32;
        else if(s[i - 1] != ' ' && s[i] >= 'A' && s[i] <= 'Z') s[i] += 32;
    }
    
    return s;
}

int main(){
    string s;
    getline(cin, s);

    cout << solution(s) << endl;

    return 0;
}