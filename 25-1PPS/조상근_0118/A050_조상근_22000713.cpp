// https://www.acmicpc.net/problem/5598

#include <iostream>
#include <string>

using namespace std;

string solution(string s){
    // 문자열을 돌며 3을 빼준다
    for(int i = 0; i < s.length(); i++){
        if(s[i] >= 'D' && s[i] <= 'Z') s[i] -= 3;
        else s[i] += 23;
    }

    return s;
}

int main(){
    string s;

    getline(cin, s);

    cout << solution(s) << endl;

    return 0;
}