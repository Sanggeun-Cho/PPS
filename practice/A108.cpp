// https://www.acmicpc.net/problem/3062

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

// 수를 문자로 변환
// 새로운 문자열에 문자를 거꾸로 정렬
// 두 문자열을 수로 변환하여 더한 수를 새로운 문자열에 저장
// 문자가 대칭인지 확인

bool isSumOfNumSymmetric(int num){
    string num_to_string = to_string(num);

    string num_copy = num_to_string;
    reverse(num_copy.begin(), num_copy.end());

    string sum = to_string(stoi(num_to_string) + stoi(num_copy));

    int left = 0, right = sum.length() - 1;
    while(left < right){
        if(sum[left] != sum[right]) return false;
        left++;
        right--;
    }
    return true;
}

int main(){
    int iteration;
    cin >> iteration;

    for(int i = 0; i < iteration; i++){
        int num;
        cin >> num;
        
        if(isSumOfNumSymmetric(num)) cout << "YES" << "\n";
        else cout << "NO" << "\n";
    }

    return 0;
}