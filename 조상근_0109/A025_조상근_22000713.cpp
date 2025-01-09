// https://leetcode.com/problems/power-of-four/description/

#include <iostream>

using namespace std;

bool isPowerOfFour(int n){
    // 수를 100으로 나눈 나머지(마지막 두자리)가 0이거나 4의 배수인 경우
        // 예외로 n == 1도 추가
    int two = n % 100;
    if(n == 1 || two == 0 || two % 4 == 0) return true;
    else return false;
}

int main(){
    int n = 5;

    if(isPowerOfFour(n)) cout << "true" << endl;
    else cout << "false" << endl;

    return 0;
}