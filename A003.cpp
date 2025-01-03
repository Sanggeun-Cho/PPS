#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> plusOne(vector<int>& digits){
    // 배열의 크기만큼 반복하며 숫자 만들기
    int num;
    for(int i = 0; i < digits.size(); i++){
        num = num * 10 + digits[i];
    }
    
    // 숫자에 1 더하기
    num++;

    // 숫자를 다시 배열로 만들어 리턴
    vector<int> result;
    while(num > 0){
        int digit = num % 10;
        result.push_back(digit);
        num = num / 10;
    }

    reverse(result.begin(), result.end());

    return result;
}

int main(){
    vector<int> digits = {1, 2, 3};
    vector<int> result = plusOne(digits);

    cout << "[";
    for(int i = 0; i < result.size(); i++){
        cout << result[i];
        if(i != result.size() - 1) cout << ", ";
    }
    cout << "]" << endl;

    return 0;
}