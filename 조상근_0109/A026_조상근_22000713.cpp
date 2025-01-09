// https://school.programmers.co.kr/learn/courses/30/lessons/12947

#include <iostream>
#include <vector>
#include <string>

using namespace std;

bool solution(int x){
    // 수를 10으로 나누며 그 나머지를 계속 더하며 각 자릿 수를 합한 수를 만듦
    int x_copy = x;
    int sum = 0;
    while(x_copy >= 1){
        sum = sum + (x_copy % 10);
        x_copy /= 10;
    }

    // x에서 자리수를 합한 수를 나눔
    if(x % sum == 0) return true;
    else return false;
}

int main(){
    int x = 10;

    if(solution(x)) cout << "true" << endl;
    else cout << "false" << endl;

    return 0;
}