// https://leetcode.com/problems/add-binary/description/

#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

string addBinary(string a, string b){
    // 0을 채워서 자릿수 맞추기
    int maxLen = max(a.length(), b.length());
    a = string(maxLen - a.length(), '0') + a;
    b = string(maxLen - b.length(), '0') + b;

    // 역순으로 계산하여 올림을 해줌
    int carry = 0;
    string answer;
    for(int i = maxLen - 1; i >= 0; i--){
        int temp = (a[i] - '0') + (b[i] - '0') + carry;
        carry = 0;
        if(temp == 3){
            carry = 1;
            answer = answer + '1';
        }
        else if(temp == 2){
            carry = 1;
            answer = answer + '0';
        }
        else if(temp == 1){
            answer = answer + '1';
        }
        else answer = answer + '0';
    }

    // 남은 올림 값이 있다면 처리
    if(carry > 0) answer = answer + '1';
    
    // 역순으로 바꿈
    reverse(answer.begin(), answer.end());

    return answer;
}

int main(){
    string a, b;

    cin >> a >> b;

    cout << addBinary(a, b) << endl;

    return 0;
}