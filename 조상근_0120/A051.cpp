// https://www.acmicpc.net/problem/5622

#include <iostream>
#include <string>

using namespace std;

int solution(string s){
    int sec = 0;
    // 문자를 인식하여 해당하는 수에 1을 더한 값을 총 시간에 더해줌
    for(int i = 0; i < s.length(); i++){
        if(s[i] >= 'A' && s[i] <= 'C') sec += 3;
        else if(s[i] >= 'D' && s[i] <= 'F') sec += 4;
        else if(s[i] >= 'G' && s[i] <= 'I') sec += 5;
        else if(s[i] >= 'J' && s[i] <= 'L') sec += 6;
        else if(s[i] >= 'M' && s[i] <= 'O') sec += 7;
        else if(s[i] >= 'P' && s[i] <= 'S') sec += 8;
        else if(s[i] >= 'T' && s[i] <= 'V') sec += 9;
        else sec += 10;
    }

    return sec;
}

int main(){
    string s;

    cin >> s;

    cout << solution(s) << endl;

    return 0;
}