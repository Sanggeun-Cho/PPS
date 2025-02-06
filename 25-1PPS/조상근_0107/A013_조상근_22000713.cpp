// https://leetcode.com/problems/single-number/description/

#include <iostream>
#include <vector>

using namespace std;

int singleNumber(vector<int> nums){
    int answer;

    // XOR 연산자 이용 -> 힌트 참조
    for(int i = 0; i < nums.size(); i++){
        answer = nums[i] ^ answer;
    }

    return answer;
}

int main(){
    vector<int> nums = {4, 1, 2, 1, 2};

    cout << singleNumber(nums) << endl;

    return 0;
}