// https://www.acmicpc.net/problem/2941

#include <iostream>
#include <string>

using namespace std;

int solution(string s){
    // 문자별로 돌며 문자열이 맞는 게 있는지 확인함
        // 철자 위치와 개수는 따로 셈

    int i = 0;
    int count = 0;

    while(i < s.length()){
        if(s.substr(i, 3) == "dz="){
            i += 3;
            count++;
        } else if(s.substr(i, 2) == "c=" || s.substr(i, 2) == "c-" || s.substr(i, 2) == "d-" || s.substr(i, 2) == "lj" || s.substr(i, 2) == "nj" || s.substr(i, 2) == "s=" || s.substr(i, 2) == "z="){
            i += 2;
            count++;
        } else{
            i++;
            count++;
        }
    }

    return count;
}

int main(){
    string s;
    cin >> s;

    cout << solution(s) << endl;

    return 0;
}