// https://leetcode.com/problems/add-digits/description/

#include <iostream>
#include <vector>

using namespace std;

int addDigits(int num){
    // 숫자의 각 자리를 나누며 그 수를 총 합에 더함
        // 만약 수가 두자리 이상이라면 재귀
    int sum = 0;
    while(num >= 1){
        sum = sum + (num % 10);
        num /= 10;
    }
    if(sum > 9) return addDigits(sum);
    else return sum;
}

int main(){
    int num = 19;

    cout << addDigits(num) << endl;

    return 0;
}