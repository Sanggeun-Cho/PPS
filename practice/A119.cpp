// https://leetcode.com/problems/guess-number-higher-or-lower/description/

#include <iostream>

using namespace std;

// 사용자가 1을 입력하면 mid와 right 사이에서 찾기
// 사용자가 -1을 입력하면 left와 mid 사이에서 찾기
// 사용자가 0을 입력하면 mid 반환

int guessNumber(int n){
    int left = 0;
    int mid = n / 2;
    int right = n;

    int user_answer;

    cout << mid << endl;

    while(user_answer != 0){
        cin >> user_answer;
        if(user_answer == 1){
            left = mid;
            mid = (right + left) / 2;
            cout << mid << endl;
        }
        if(user_answer == -1){
            right = mid;
            mid = (right + left) / 2;
            cout << mid << endl;
        }
    }
    
    return mid;
}

int main(){
    int n = 100;

    cout << guessNumber(n) << endl;

    return 0;
}