// https://www.acmicpc.net/problem/2475

#include <iostream>
#include <vector>

using namespace std;

int Verification(vector<int> nums){
    int sum = 0;

    for(int i = 0; i < 5; i++){
        sum += nums[i] * nums[i];
    }

    return sum % 10;
}

int main(){
    int temp;
    vector<int> nums;

    for(int i = 0; i < 5; i++){
        cin >> temp;
        nums.push_back(temp);
    }

    cout << Verification(nums) << endl;

    return 0;
}