// https://leetcode.com/problems/majority-element/description/

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int majorityElement(vector<int> nums){
    // 배열 정렬
    // 가운데 있는 수를 리턴
    sort(nums.begin(), nums.end());

    int index;
    if(nums.size() / 2 == 0) index = nums.size() / 2;
    else index = nums.size() / 2 + 1;

    return nums[index];
}

int main(){
    vector<int> nums = {3, 2, 3};

    cout << majorityElement(nums) << endl;

    return 0;
}