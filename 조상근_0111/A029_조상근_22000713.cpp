// https://www.acmicpc.net/problem/17210

#include <iostream>
#include <vector>
#include <string>

using namespace std;

void solution(int door, int method){
    // door가 6이상이면 통과 불가능
    if(door > 5) cout << "Love is open door" << endl;

    // 그렇지 않다면 method를 기준으로 0과 1을 반복해서 출력
    else {
        for(int i = 0; i < door - 1; i++){
            method = 1 - method; // ChatGPT 참고
            cout << method << endl;
        }
    }
}

int main(){
    int door, method;

    cin >> door >> method;

    solution(door, method);

    return 0;
}