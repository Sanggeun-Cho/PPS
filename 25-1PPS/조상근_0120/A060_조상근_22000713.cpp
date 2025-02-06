// https://leetcode.com/problems/baseball-game/description/

#include <iostream>
#include <vector>
#include <string>

using namespace std;

int calPoints(vector<string> operations){
    // 숫자는 stoi로 push
    // C면 pop_back
    // D면 마지막 숫자 *2 한 후 pop하고 push
    // +면 마지막 두 숫자 합친 수 push
    vector<int> nums;
    for(int i = 0; i < operations.size(); i++){
        if(operations[i] == "C"){
            if(nums.size() > 0) nums.pop_back();
        }
        else if(operations[i] == "D"){
            int temp = nums[nums.size() -1] * 2;
            nums.push_back(temp);
        }
        else if(operations[i] == "+"){
            int temp = nums[nums.size() - 2] + nums[nums.size() - 1];
            nums.push_back(temp);
        }
        else {
            nums.push_back(stoi(operations[i]));
        }
    }
    int total = 0;
    for(int i : nums){
        total += i;
    }

    return total;
}

int main(){
    vector<string> ops = {"5" , "2", "C", "D", "+"};

    cout << calPoints(ops) << endl;

    return 0;
}