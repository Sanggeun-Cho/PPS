// https://leetcode.com/problems/move-zeroes/description/

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void moveZeros(vector<int> nums){
    int new_index_of_nums = 0;

    for(int i : nums){
        if(i != 0){
            nums[new_index_of_nums] = i;
            new_index_of_nums++;
        }
    }
    for(int i = new_index_of_nums; i < nums.size(); i++){
        nums[i] = 0;
    }

    cout << "[";
    for(int i = 0; i < nums.size(); i++){
        cout << nums[i];
        if(i < nums.size() - 1) cout << ", ";
    }
    cout << "]" << endl;
}

int main(){
    vector<int> nums = {0, 1, 0, 3, 12};

    moveZeros(nums);

    return 0;
}