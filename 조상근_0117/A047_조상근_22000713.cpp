// https://www.acmicpc.net/problem/11721

#include <iostream>
#include <string>

using namespace std;

void solution(string s){
    // 문자열을 하나씩 출력하며 10번의 반복때마다 줄바꿈을 출력 (1부터 시작하는 게 유리)
    for(int i = 1; i <= s.length(); i++){
        cout << s[i - 1];
        if(i % 10 == 0) cout << endl;
    }
}

int main(){
    string s;

    cin >> s;

    solution(s);

    return 0;
}