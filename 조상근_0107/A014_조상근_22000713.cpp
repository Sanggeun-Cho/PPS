// https://leetcode.com/problems/summary-ranges/description/

#include <iostream>
#include <vector>
#include <string>

using namespace std;

vector<string> summaryRanges(vector<int> nums){
    // 챗지피티에게 힌트

    // 시작 값을 정함 (초기에는 nums[0])
    int start = nums[0];

    // 반복문을 돌면서 배열의 그 전 수와 연속하지 않으면 || 배열이 끝나면
        // start와 같으면 그 수를 문자열로 정함
        // start와 같지 않으면 start + "->" + 해당 수
        // answer에 push_back
    vector<string> answer;
    for(int i = 1; i <= nums.size(); i++){
        if(i == nums.size() || nums[i] != nums[i - 1] + 1){
            if(start == nums[i - 1]){
                answer.push_back(to_string(nums[i - 1]));
            } else{
                answer.push_back(to_string(start) + "->" + to_string(nums[i - 1]));
            }
            start = nums[i];
        }
    }

    return answer;
}

int main(){
    vector<int> nums = {0, 2, 3, 4, 6, 8, 9};
    vector<string> answer = summaryRanges(nums);

    cout << "[";
    for(int i = 0; i < answer.size(); i++){
        cout << answer[i];
        if(i < answer.size() - 1) cout << ", ";
    }
    cout << "]" << endl;
    
    return 0;
}