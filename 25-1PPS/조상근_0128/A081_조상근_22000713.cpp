// https://www.acmicpc.net/problem/2693

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> nums){
    // 정렬 후 3번째 수 리턴
    sort(nums.begin(), nums.end(), greater<>());

    return nums[2];
}

int main(){
    int num;

    cin >> num;

    for(int i = 0; i < num; i++){
        vector<int> nums;
        int temp;
        for(int i = 0; i < 10; i++){
            cin >> temp;
            nums.push_back(temp);
        }
        cout << solution(nums) << "\n";
    }

    return 0;
}